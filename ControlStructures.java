public class ControlStructures {
    public static void main(String[] args) {
        int examinationMark = 68;

        // Selection
        if (examinationMark >= 50) {
            System.out.println("Result: Pass");
        }

        // Iteration
        for (int unitNumber = 1; unitNumber <= 3; unitNumber++) {
            System.out.println("Processing unit " + unitNumber);
        }

        // Branching
        for (int record = 1; record <= 5; record++) {
            if (record == 4) {
                break;
            }
            System.out.println("Academic record " + record);
        }
    }
}
