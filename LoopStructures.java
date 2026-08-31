public class LoopStructures {
    public static void main(String[] args) {
        int whileCounter = 1;

        while (whileCounter <= 3) {
            System.out.println("While loop record: " + whileCounter);
            whileCounter++;
        }

        int doWhileCounter = 4;

        do {
            System.out.println("Do-while record: " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter <= 3);
    }
}
