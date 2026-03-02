package Arrays;

import java.util.*;

public class ProductOfArrayExceptSelf {
    public static int[] findProduct(int arr[]) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int temp = 1;
            for(int j = 0; j < arr.length; j++){
                if(i!=j){
                    temp *= arr[j];
                }
            }
            result[i] = temp;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] inputs = {
                {1, 2, 3, 4},
                {5, -3, 1, 2},
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {-1, -2, -4}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("%d.\t Array: %s%n", i + 1, Arrays.toString(inputs[i]));
            System.out.printf("%n\t List of products: %s%n", Arrays.toString(findProduct(inputs[i])));
            System.out.println('-' + String.join("", Collections.nCopies(70, "-")) + '\n');
        }
    }

}
