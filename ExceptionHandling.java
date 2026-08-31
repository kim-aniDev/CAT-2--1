public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int totalMarks = 100;
            int numberOfUnits = 0;
            int average = totalMarks / numberOfUnits;
            System.out.println(average);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException handled: division by zero.");
        }

        try {
            String studentName = null;
            System.out.println(studentName.length());
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException handled.");
        }

        try {
            int[] marks = {60, 70, 80};
            System.out.println(marks[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        }
    }
}
