package Arrays_and_Arraylist;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Arrays_shortcuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter the elements of the array: ");
//        input
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1) + " row");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//        output
        System.out.println("Using normal loop");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
//        Enhanced for:loop
        System.out.println("Using Enhanced-for loop");
        for(int[] arr : a){
            System.out.println(Arrays.toString(arr));
        }
    }
}