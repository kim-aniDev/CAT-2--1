public class WrapperClasses {
    public static void main(String[] args) {
        int registrationNumber = 1042;
        char grade = 'B';

        Integer wrappedRegistrationNumber = Integer.valueOf(registrationNumber);
        Character wrappedGrade = Character.valueOf(grade);

        System.out.println("Wrapped registration number: " + wrappedRegistrationNumber);
        System.out.println("Wrapped grade: " + wrappedGrade);
    }
}
