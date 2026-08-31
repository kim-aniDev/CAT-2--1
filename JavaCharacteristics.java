class StudentRecord {
    private String studentName;

    StudentRecord(String studentName) {
        this.studentName = studentName;
    }

    void displayRecord() {
        System.out.println("Student: " + studentName);
    }
}

public class JavaCharacteristics {
    public static void main(String[] args) {
        StudentRecord record = new StudentRecord("Simon Kimani");
        record.displayRecord();

        System.out.println("Java bytecode is executed by the JVM.");
        System.out.println("Java supports object-oriented programming.");
        System.out.println("Java provides exception handling and type checking.");
        System.out.println("Java includes security mechanisms such as bytecode verification.");
    }
}
