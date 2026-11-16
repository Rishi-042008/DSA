package Conditionals_and_loops;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day:");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1,2,3,4,5 -> System.out.println("Weekdays");
//            case 6,7 -> System.out.println("Weekends");
//        }
        // Nested switch case
        System.out.println("Enter the Employee ID");
        int empID = sc.nextInt();
        System.out.println("Enter the department");
        String department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Rahul Manju");
            case 2 -> System.out.println("Rajshekar Ram");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }
    }
}



