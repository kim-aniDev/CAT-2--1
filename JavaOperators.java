public class JavaOperators {
    public static void main(String[] args) {
        int courseworkMark = 72;
        int examinationMark = 68;

        int totalMark = courseworkMark + examinationMark;
        boolean passed = totalMark >= 100;
        boolean eligibleForAward = passed && courseworkMark >= 40;

        int adjustedMark = courseworkMark;
        adjustedMark += 3;

        System.out.println("Total mark: " + totalMark);
        System.out.println("Passed: " + passed);
        System.out.println("Eligible for award: " + eligibleForAward);
        System.out.println("Adjusted coursework mark: " + adjustedMark);
    }
}
