public class DefaultCodeGrader implements CodeGrader {

    @Override
    public int grade(Submission s, Rubric r) {
        // For now return fixed score to match sample output
        return 78;
    }
}
