package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50; // 50 saved to element 6

        // double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);

//        int[] myIntArray = new int[25]; // {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//
//    // Method to print array
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " value is " + array[i]);
//        }

        // Sum Total of Numbers Entered by User
//        int[] myIntegers = getIntegers(5);

//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
//    }

//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];

//        for (int i = 0; i < values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }

//    // Return Average of Numbers from array
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;
//    }

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0; i<array.length;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Print Array
    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println("Element " + i + "contents " + array[i]);
        }
    }

    // Sort array method
    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0;i<array.length;i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0;i < sortedArray.length - 1;i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }



}
