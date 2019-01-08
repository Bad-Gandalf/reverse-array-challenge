package com.patdoc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter length of array :");
        int count = scanner.nextInt();
        int array[] = readIntegers(count);
        int[] reversedArray = reverse(array);
        for (int i=0; i<reversedArray.length; i++)
        System.out.print(reversedArray[i] + ",");

    }
    // Makes a copy of the array and produces a reverse of the array
//    public static int[] reverse(int[] array){
//        int [] reversedArray = Arrays.copyOf(array, array.length);
//        for(int i =0; i<array.length; i++){
//            reversedArray[i] = array[(array.length-(i+1))];
//        }
//        return reversedArray;
//    }
    // Reverse the actual array
    public static void reverse(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }



    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integer values.\r");
        int[] values = new int[count];
        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

}
