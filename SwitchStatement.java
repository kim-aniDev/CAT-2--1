public class SwitchStatement {
    public static void main(String[] args) {
        int academicLevel = 2;

        switch (academicLevel) {
            case 1:
                System.out.println("First Year");
                break;
            case 2:
                System.out.println("Second Year");
                break;
            case 3:
                System.out.println("Third Year");
                break;
            default:
                System.out.println("Academic level not recognized");
        }
    }
}
