package Arrays;

import java.util.*;

public class RightRotate {
    public static int[] rightRotate(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        // Replace this placeholder return statement with your code
        return result;
    }
    public static void main(String[] args) {
        int[][] inputs = {
                {10, 20, 30, 40, 50},
                {1, -2, 3, 4, 5},
                {-1, 90, -90, 4, 6},
                {3, 6, 9, -12},
                {-100, -200, -300}
        };
        int[] k = {3, 2, 6, 2, 1};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tnums: " + Arrays.toString(inputs[i]));
            System.out.println("\tk: " + k[i]);

            int[] rotated = rightRotate(inputs[i], k[i]);
            System.out.println("\n\tRotated Array: " + Arrays.toString(rotated));
            System.out.println(new String(new char[70]).replace('\0', '-'));

        }
    }

}
