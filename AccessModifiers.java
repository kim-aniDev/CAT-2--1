class AcademicRecord {
    public String studentName = "Simon Kimani";
    protected int courseworkMark = 72;
    int semester = 2; // default access
    private String confidentialRemark = "Good standing";

    public void displayRecord() {
        System.out.println(studentName);
        System.out.println(courseworkMark);
        System.out.println(semester);
        System.out.println(confidentialRemark);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        AcademicRecord record = new AcademicRecord();

        System.out.println(record.studentName);
        System.out.println(record.courseworkMark);
        System.out.println(record.semester);

        // record.confidentialRemark cannot be accessed here because it is private.
        record.displayRecord();
    }
}
