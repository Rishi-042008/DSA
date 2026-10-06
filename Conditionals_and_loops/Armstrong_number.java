package Conditionals_and_loops;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int originalNum = num;
        int numberOfDigits = num;
        int rem;
        double sum = 0;
        int counter = 0;


        while (numberOfDigits > 0) {
            numberOfDigits /= 10;
            counter++;
        }

        while (num > 0) {
            rem = num % 10;
            sum += Math.pow(rem, counter);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
