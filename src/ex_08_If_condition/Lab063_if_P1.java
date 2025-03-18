package ex_08_If_condition;

public class Lab063_if_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("yes, you can go to GOA");
        } else {
            System.out.println("you can't'");
        }
    }
}
