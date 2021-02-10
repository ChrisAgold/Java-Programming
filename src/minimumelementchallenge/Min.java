package minimumelementchallenge;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;

public class Min {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextInt();

        int[] returnArray = readIntegers(count);
        int returnedMin = findMin(returnArray);

        System.out.println("min= " + returnedMin);
    }

    // Method
    private static int[] readIntegers(int count) {
        // create an int array & populate with the users input
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    // Method to find minimum int entered
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;


    }
}
