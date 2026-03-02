package Arrays;

import java.util.Arrays;

class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return nums;

        // Initialize pointers to the start and end of the array
        int maxIdx = n - 1;
        int minIdx = 0;
        // Initialize a variable larger than any element in the array to use for encoding
        int maxElem = nums[n - 1] + 1;

        // Encoding phase
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {  // Encoding at even indexes
                nums[i] += (nums[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {  // Encoding at odd indexes
                nums[i] += (nums[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        // Decoding phase
        for (int i = 0; i < n; ++i) {
            nums[i] = nums[i] / maxElem;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[][] inputArray = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {11, 22, 33, 44, 55, 66, 77, 88},
            {1, 2, 4, 8, 16, 32, 64, 128, 512, 1024},
            {3, 3, 5, 5, 7, 7, 9, 9, 11, 11, 13, 13},
            {100, 233, 544, 753, 864, 935, 1933, 2342}
        };

        for (int i = 0; i < inputArray.length; ++i) {
            System.out.print(i + 1 + ".\tOriginal array: " + Arrays.toString(inputArray[i]));
            int[] rearranged = rearrangeArray(inputArray[i]);
            System.out.print("\n\tRearranged array: " + Arrays.toString(rearranged));
            System.out.println("\n" + new String(new char[100]).replace('\0', '-'));
        }
    }
}
