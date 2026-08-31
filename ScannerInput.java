import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter CAT mark: ");
        int catMark = input.nextInt();

        System.out.println("Student: " + studentName);
        System.out.println("CAT mark: " + catMark);

        input.close();
    }
}
