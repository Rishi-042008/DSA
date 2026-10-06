package Conditionals_and_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        if (n >= 0) {
            System.out.print(a + " ");
        }
        if (n >= 1) {
            System.out.print(b + " ");
        }
        while (count <= n) {
            int next = b + a;
            System.out.print(next + " ");
            a = b;
            b = next;
            count++;
        }
    }
}
