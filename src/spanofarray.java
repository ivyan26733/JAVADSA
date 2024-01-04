public class spanofarray {
    public static void main(String[] args) {
        int[] arr = {15,30,40,4,11,9};

        //Span of array to find difference between highest and lowest element

        int max = -1;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }

        int diff = max - min;

        System.out.println(diff);
    }
}
