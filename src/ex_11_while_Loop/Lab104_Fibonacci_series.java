package ex_11_while_Loop;

import java.util.Scanner;

public class Lab104_Fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int sum;
        int First = 0;
        int Second = 1;
        System.out.println(First);
        System.out.println(Second);
        for (int i=0;i<=n; i++ ) {
            sum = First + Second;
            System.out.println(sum);
            First = Second;
            Second= sum;
        }

    }
}
