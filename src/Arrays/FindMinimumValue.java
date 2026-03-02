package Arrays;

import java.util.*;

public class FindMinimumValue {
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {

        int[][] inputs = {
                {9},
                {-1, -5, -10, -2, -4},
                {4, 3, 2, 1},
                {2, 3, 3, -1, -1},
                {100, 50, 75, 25, 400},

        };

        for (int i = 0; i < inputs.length; ++i) {
            System.out.print((i + 1) + ".\tInput list: ");
            System.out.println(Arrays.toString(inputs[i]));

            int result = findMinimum(inputs[i]);

            System.out.print("\n\tMinimum element: ");
            System.out.println(result);
            System.out.println(new String(new char[100]).replace('\0', '-'));

        }

    }

}
