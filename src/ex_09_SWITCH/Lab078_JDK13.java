package ex_09_SWITCH;

public class Lab078_JDK13 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 005;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
