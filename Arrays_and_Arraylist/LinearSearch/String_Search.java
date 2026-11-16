package Arrays_and_Arraylist.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String_Search {
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
            for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i)){
                    return true;
                }
            }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println("Enter a character to search in a string");
        char target = sc.next().charAt(0);
        boolean output = search(str,target);
        System.out.println(output);
//        System.out.println(Arrays.toString(str.toCharArray())); to print a character array we use this thing
    }
}
