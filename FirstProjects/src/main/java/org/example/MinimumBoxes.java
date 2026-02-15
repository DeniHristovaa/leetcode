package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int apples = 0;
        int totalApple = 0;
        int boxesUsed = 0;

        for (int i = 0; i < apple.length; i++) {
            totalApple += apple[i];
        }

        for (int i = capacity.length - 1; i >= 0; i--) {
            apples += capacity[i];
            boxesUsed ++;
            if (apples >= totalApple) {
                System.out.println("Min used boxes = " + boxesUsed + " with capacity = " + apples);
                break;
            }
        }
        return boxesUsed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int m  = sc.nextInt();
        int[] apple = new int[m];
        System.out.println("Enter number of apples in a package: ");
        for (int i = 0; i < m; i++) {
            apple[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] capacity = new int[n];
        System.out.println("Enter the capacity of the boxes: ");
        for (int i = 0; i < n; i++) {
            capacity[i] = sc.nextInt();
        }

        MinimumBoxes c = new MinimumBoxes();

//        test
        int result = c.minimumBoxes(apple, capacity);

        System.out.println(result);
    }
}
