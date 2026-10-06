package Conditionals_and_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else if(ch>='A' && ch<='Z') {
            System.out.println("Uppercase");
        }else {
            System.out.println("Invalid Character");
        }
    }
}