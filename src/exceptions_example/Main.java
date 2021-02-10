package exceptions_example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("book");
//        System.out.println(list.get(0));

        // try catch
//        try {
//            int[] a = {4, 5, 1};
//            System.out.println(a[3]);
//        } catch (Exception e) {
//            System.out.println("An exception happened");
//        }
        
//        Scanner scan = new Scanner(System.in);
//        try {
//            System.out.println("What's your fav number?");
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch (Exception e1) {
//            System.out.println("That's not a number!");
//        }

        try {
            int[] a = null;
            System.out.println(a[1]);
        } catch(NullPointerException e) {
            System.out.println("Your array is null");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds.");
        } catch(Exception e) {
            System.out.println("Something else went wrong!");
        }
    }
}




