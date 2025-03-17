package ex_05_typeCasting;

public class Lab041_typeCasting {
    public static void main(String[] args) {
        long phone_no = 8329539881l;
       // short s = phone_no; //implicit not allowed
        short s =(short) phone_no; //explict casting-narrowing
        System.out.println(s);


    }
}
