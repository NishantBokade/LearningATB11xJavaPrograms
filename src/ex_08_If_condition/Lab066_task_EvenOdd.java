package ex_08_If_condition;

import java.util.Scanner;

public class Lab066_task_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check the number is even or odd");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number" + number + "is even");
        } else {
            System.out.println("the number" + number + "is odd");
        }
    }

}