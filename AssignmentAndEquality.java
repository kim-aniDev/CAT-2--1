public class AssignmentAndEquality {
    public static void main(String[] args) {
        int firstMark = 75;
        int secondMark = 75;

        int recordedMark = firstMark; // assignment using =
        boolean sameMark = firstMark == secondMark; // comparison using ==

        System.out.println("Recorded mark: " + recordedMark);
        System.out.println("Marks are equal: " + sameMark);
    }
}
