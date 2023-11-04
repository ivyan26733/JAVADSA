import java.util.Scanner;

public class PrintSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        printTargetSumSubsets(arr , 0 ,""  ,0 ,target);

    }
    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        //Base case should be that it should check that sum of subset should be equls to target
        if (idx==arr.length) {
            if (sos == tar) {
                System.out.println(set + ",");
            }
            return;
        }

        //In this first recursive should be like index increase by one , in subset element will be stored and in sos element will be added
        printTargetSumSubsets(arr , idx+1 , set+arr[idx] + " , ",sos + arr[idx], tar);
        //In second call , only index will be increase
        printTargetSumSubsets(arr , idx+1 , set , sos , tar);
    }
}
