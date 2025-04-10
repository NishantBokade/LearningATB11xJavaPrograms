package ex_30_Exceptions;

public class Lab190_NullPointer_Exceptions {
    public static void main(String[] args) {
        String name= null;
        name.trim(); // java.lang.NullPointerException
    }
}
