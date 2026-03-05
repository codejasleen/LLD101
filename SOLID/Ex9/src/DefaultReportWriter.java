public class DefaultReportWriter implements ReportWriter {
     @Override
    public String write(Submission s, int plag, int code) {

        String fileName = "report-" + s.getId() + ".txt";

        // simulate writing
        System.out.println("Report written: " + fileName);

        return fileName;
    }
}
