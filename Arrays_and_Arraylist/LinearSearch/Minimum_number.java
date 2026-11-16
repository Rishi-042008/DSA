package Arrays_and_Arraylist.LinearSearch;

import java.util.Scanner;

public class Minimum_number {
    static int minimum(int a[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int [] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the "+i+" th element of array");
                a[i] = sc.nextInt();
        }
        System.out.println("The minimum element in the given array is "+minimum(a));
    }
}
