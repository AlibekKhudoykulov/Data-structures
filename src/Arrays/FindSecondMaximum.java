package Arrays;

import java.util.*;

public class FindSecondMaximum {
    public static int findSecondMaximum(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secondMax && nums[i] != firstMax) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {9, 2, 3, 6},
                {1, 2},
                {-2, 2},
                {-4, -1, -9, 1, -7},
                {25, 50, 75, 100, 100}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tArray: " + Arrays.toString(inputs[i]));
            System.out.println("\n\tSecond maximum value: " + findSecondMaximum(inputs[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}
