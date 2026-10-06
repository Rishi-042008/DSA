package Conditionals_and_loops;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take the input from the user till the user does not press X
        double ans = 0;
        while (true) {
            System.out.println("Enter the operation you want to do if you want exit press 'X'");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter the two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}
