package Conditionals_and_loops;

import java.util.Scanner;

public class Counting_occurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number more than 10 digits");
        long n = sc.nextLong();
        System.out.print("Enter the digit to count: ");
        int targetDigit = sc.nextInt();
        int count = 0;
        while (n>0){
            long rem = n % 10;
            if(rem == targetDigit){
                count++;
            }
            n/=10;
        }
        System.out.println("The occurrence of Target digit "+targetDigit+" is : "+count+" times");
    }
}
