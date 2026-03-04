class NextGreaterElement{
      public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    result[i] = arr[j];
                    break;
                }
                if(j==arr.length-1) result[i] = -1;
            }
            if(i==arr.length-1) result[i] = -1;
        }
        return result;
    }
}