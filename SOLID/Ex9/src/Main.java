public class Main {
    public static void main(String[] args) {
        System.out.println("=== Evaluation Pipeline ===");
        Submission sub = new Submission("23BCS1007", "public class A{}", "A.java");
      PlagiarismChecker checker = new DefaultPlagiarismChecker();
CodeGrader grader = new DefaultCodeGrader();
ReportWriter writer = new DefaultReportWriter();
Rubric rubric = new Rubric();

EvaluationPipeline pipeline =
    new EvaluationPipeline(checker, grader, writer, rubric);

pipeline.evaluate(sub);
    }
}