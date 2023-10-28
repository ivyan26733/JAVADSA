import java.util.*;

public class RemovePrime {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100));
//        int arr[] = new int[]{1,23,25,721,52};
        System.out.println(RemovePrime(arr));
    }

    public static ArrayList<Integer> RemovePrime(ArrayList<Integer> arr){
//        ArrayList<Integer> arr1 = new ArrayList<>(arr);
        for (int i=0;i<arr.size();i++){
                  if (arr.get(i)%2 != 0){
                      arr.remove(i);
                  }
        }
        return arr;
    }
}
