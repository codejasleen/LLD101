public class Submission {

    private final String id;
    private final String code;
    private final String fileName;

    public Submission(String id, String code, String fileName) {
        this.id = id;
        this.code = code;
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getFileName() {
        return fileName;
    }
}
