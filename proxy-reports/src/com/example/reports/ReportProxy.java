package com.example.reports;

/**
 * TODO (student):
 * Implement Proxy responsibilities here:
 * - access check
 * - lazy loading
 * - caching of RealReport within the same proxy
 */
public class ReportProxy implements Report {

    private final String reportId;
    private final String title;
    private final String classification;
    private final AccessControl accessControl = new AccessControl();

 private RealReport realReport; 
 
    public ReportProxy(String reportId, String title, String classification) {
        this.reportId = reportId;
        this.title = title;
        this.classification = classification;
    }

    @Override
    public void display(User user) {
         if (!accessControl.canAccess(user, classification)) {
            System.out.println("Access denied for user: " + user.getName());
            return;
        }

        // 2️⃣ Lazy loading
        if (realReport == null) {
            System.out.println("Proxy: creating RealReport (lazy loading)");
            realReport = new RealReport(reportId, title, classification);
        }

        // 3️⃣ Reuse cached object
        realReport.display(user);
    }
}
