public class EvaluationPipeline {

    private final PlagiarismChecker plagiarismChecker;
    private final CodeGrader codeGrader;
    private final ReportWriter reportWriter;
    private final Rubric rubric;

public EvaluationPipeline(
        PlagiarismChecker plagiarismChecker,
        CodeGrader codeGrader,
        ReportWriter reportWriter,
        Rubric rubric
) {
    this.plagiarismChecker = plagiarismChecker;
    this.codeGrader = codeGrader;
    this.reportWriter = reportWriter;
    this.rubric = rubric;
}

public void evaluate(Submission submission) {

    System.out.println("=== Evaluation Pipeline ===");

    int plagiarism = plagiarismChecker.check(submission);
    System.out.println("PlagiarismScore=" + plagiarism);

    int codeScore = codeGrader.grade(submission, rubric);
    System.out.println("CodeScore=" + codeScore);

    int total = plagiarism + codeScore;

    reportWriter.write(submission, plagiarism, codeScore);

    System.out.println("FINAL: PASS (total=" + total + ")");
}
}
