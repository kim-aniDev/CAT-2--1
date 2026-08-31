public class MethodOverloading {
    static double calculateAverage(int catMark, int examMark) {
        return (catMark + examMark) / 2.0;
    }

    static double calculateAverage(int assignmentMark, int catMark, int examMark) {
        return (assignmentMark + catMark + examMark) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("Average of CAT and exam: "
                + calculateAverage(70, 80));

        System.out.println("Average of assignment, CAT and exam: "
                + calculateAverage(65, 75, 80));
    }
}
