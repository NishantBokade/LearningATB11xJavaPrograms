package ex_05_typeCasting;

public class Lab040_reverseTypeCasting {
    public static void main(String[] args) {
        int val = 200;
       // byte b = val; //  byte b = val; //invalid-narrowing-implicit casting is not allowed
        byte b2 = (byte)val; // valid- narrowing- explicit casting allowed
        //data loss
        System.out.println(b2);
    }
}
