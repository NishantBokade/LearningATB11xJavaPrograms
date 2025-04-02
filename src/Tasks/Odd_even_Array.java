package Tasks;

public class Odd_even_Array {
    public static void main(String[] args) {
        int n[] = {12, 15, 22, 27, 59};
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.println("Even number" + n[i]);
            } else {
                System.out.println("Odd number" + n[i]);
            }

        }
    }
}