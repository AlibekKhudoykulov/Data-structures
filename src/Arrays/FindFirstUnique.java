package Arrays;

import java.util.*;

public class FindFirstUnique {
    public static int findFirstUnique(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            boolean unique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    unique = false;
                }
            }
            if (unique == true) return nums[i];
        }

        // Replace this placeholder return statement with your code
        return result;
    }
    public static void main(String[] args) {
        int[][] inputs = {
                {9, 2, 3, 2, 6, 6},
                {-5, -4, -4, 6, -1},
                {-1, 2, -1, -4, -10},
                {1, 1, 2, 9},
                {-2, 2, -2, 2, 5}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tInput list: " + Arrays.toString(inputs[i]));
            Integer firstUnique = findFirstUnique(inputs[i]);
            System.out.println("\tFirst unique number: " + (firstUnique != null ? firstUnique : "None") + "\n");
        }
    }
}
