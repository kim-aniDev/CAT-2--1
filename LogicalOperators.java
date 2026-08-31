public class LogicalOperators {
    public static void main(String[] args) {
        int studentAge = 20;
        boolean registered = true;
        boolean hasClearance = false;

        boolean eligibleForExamination =
                (studentAge >= 18) && registered;

        boolean requiresAttention =
                !registered || !hasClearance;

        System.out.println("Eligible for examination: "
                + eligibleForExamination);

        System.out.println("Requires attention: "
                + requiresAttention);
    }
}
