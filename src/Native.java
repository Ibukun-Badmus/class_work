public class Native {

    private String studentId;
    private String firstName;
    private String surname;

    private int javaGrade;
    private int designThinkingGrade;
    private int databaseGrade;

    public Native(){}

    public Native(String id, String fName, String surname, int[] grades){
        studentId = id;
        firstName = fName;
        this.surname = surname;

        javaGrade = grades[0];
        designThinkingGrade = grades[1];
        databaseGrade = grades[2];
    }

    public Native(String studentId, String firstName, String surname) {
    }

    public void setStudentID(String studentID) {
        this.studentId = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDatabaseGrade(int databaseGrade) {
        this.databaseGrade = databaseGrade;
    }

    public void setDesignThinkingGrade(int designThinkingGrade) {
        this.designThinkingGrade = designThinkingGrade;
    }

    public void setJavaGrade(int javaGrade) {
        this.javaGrade = javaGrade;
    }

    public int getJavaGrade() {
        return  javaGrade;
    }
}
