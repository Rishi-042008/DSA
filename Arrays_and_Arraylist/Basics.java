package Arrays_and_Arraylist;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int  [][] a= new int[n][n];
        int [][] b = new int[n][n];
        int [][] c = new int[n][n];

        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the elements of array 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Addition of two matrices is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}