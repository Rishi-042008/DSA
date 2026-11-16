package Arrays_and_Arraylist.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    static String search(String str, char target,int start , int end){
        if(str.length() == 0){
            return "There is no String entered";
        }
        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)){
                return "The entered Character is present at "+(i+1)+"th position of the String";
            }
        }
        return "The entered Character is not present";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println("Enter the starting point :");
        int start = sc.nextInt();
        System.out.println("Enter the ending point :");
        int end = sc.nextInt();
        System.out.println("Enter a character to search in a string");
        char target = sc.next().charAt(0);
        String output = search(str,target,start,end);
        System.out.println(output);
    }
}
