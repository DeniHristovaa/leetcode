package org.example;

import java.util.Scanner;

public class AdjacentElementsInCircle {
    public static int maximumDifference(int[] array){
        int maximumDifference = 0;
        for(int i = 0; i < array.length - 2; i++) {
            maximumDifference = Math.abs(array[i] - array[i + 1]);
            int nextDifference = Math.abs(array[i+1] - array[i+2]);
            if (nextDifference > maximumDifference){
                maximumDifference = nextDifference;
            }
        }
        int lastDifference = Math.abs(array[0] - array[array.length - 1]);
        if (lastDifference > maximumDifference){
            maximumDifference = lastDifference;
        }
        return maximumDifference;
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Maximum difference is: "+ maximumDifference(array));
    }

}
