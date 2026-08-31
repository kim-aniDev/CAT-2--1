public class ConditionalStatements {
    public static void main(String[] args) {
        int examinationMark = 74;

        if (examinationMark >= 70) {
            System.out.println("Grade: A");
        } else if (examinationMark >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        int semester = 2;
        switch (semester) {
            case 1:
                System.out.println("First Semester");
                break;
            case 2:
                System.out.println("Second Semester");
                break;
            default:
                System.out.println("Invalid semester");
        }
    }
}
