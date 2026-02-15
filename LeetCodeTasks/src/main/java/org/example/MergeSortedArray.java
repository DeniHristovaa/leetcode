package org.example;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.print("m: ");
        int m = sc.nextInt();

        int n1 = n + m;
        System.out.println("Number of array 1's elements: " + n1);

        int n2 = n;
        System.out.println("Number of array 2's elements: " + n2);

        int[] num1 = new int[n1];

        int[] num2 = new int[n2];

        System.out.print("Insert number of elements for sort from first array: ");
        for (int i = 0; i < n1; i++) {
            num1[i] = sc.nextInt();
        }

        System.out.print("Insert number of elements for sort from second array: ");
        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }

        int[] sortedArray1 = Arrays.stream(num1).sorted().toArray();
        Arrays.sort(num2);

        int[] finalArray = finalArray(sortedArray1, num2, n2, n1);

        System.out.println("The result of the merge is " + Arrays.toString(finalArray) + " with the underlined elements coming from nums1.");
    }

    public static int[] finalNumsFromArrays(int[] array, int length){
        int[] finalNum = new int[length];
        for (int i = 0; i < length; i++){
            finalNum[i] = array[i];
        }
        return finalNum;
    }

    public static int[] finalArray(int[] array1, int[] array2, int n, int m){
        int[] finalNum1 = finalNumsFromArrays(array1, m);

        int[] finalNum2 = finalNumsFromArrays(array2, n);

        for (int i = 0; i < n; i++){
            finalNum1[n + i] = finalNum2[i];
        }

        return Arrays.stream(finalNum1).sorted().toArray();
    }
}
