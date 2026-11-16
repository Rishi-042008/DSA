package Arrays_and_Arraylist.LinearSearch;

import java.util.Scanner;

public class search_in_2D_arrays {
    static boolean search(int [][] arr ,int s){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == s){
                    System.out.format("The Element is present in %dX%d\n",i+1,j+1);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int [][] a = new int[rows][cols];

        System.out.println("Enter the 2D array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("Enter the %dX%d element of array:\n",i+1,j+1);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element you need to search :");
        int s = sc.nextInt();

        if (!search(a, s)) {
            System.out.println("Element not found in the array.");
        }
    }
}
