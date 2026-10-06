package Conditionals_and_loops;

import java.util.Scanner;

public class Reversing_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int a = sc.nextInt();
        int rev = 0;
        while (a > 0){
            int rem = a%10;
            a/=10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
