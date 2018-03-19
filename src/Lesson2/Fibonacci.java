package Lesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner qnt = new Scanner(System.in);
        System.out.println("Please, put any integer number: ");
        int n = qnt.nextInt();
        int num1 = 0;
        int num2 = 1;
        int fib = 2;
        int i = 2;
        System.out.println("Fibonacci numbers " + n + ":");
        System.out.println(num1 + " " + num2);

        while (i < n) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            i++;
            System.out.println(" " + fib);
        }

    }
}
