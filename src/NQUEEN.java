import java.util.Scanner;


public class NQUEEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int[][] arr = new int[n][n];
        printQueens(arr," ", 0);

    }

    public static void printQueens(int[][] arr, String qsf , int row){   //remember that row here is a parameter and column will be option because we r making loop on that or calling it
        //base case
        if (row==arr.length){
            System.out.println(qsf + ",");
            return;
        }

        //Row reference we have now with help of column we will iterate over array
        for (int col = 0;col< arr.length;col++){
            //A new function will be introduced that will check wether the queen placed is safe or not
            if (isQueensafe(arr, row, col)){
            arr[row][col] = 1;  //This side is left side of the tree and will be implemented before the edge
            printQueens(arr, row+"-"+col , row+1); //This is the edge os the tree
            arr[row][col] = 0; //This is right side of the tree and will be implemented after the edge

        }}}

        static boolean isQueensafe(int[][] arr,int row,int col){
        //Here we will check for three directions
         //Vertically up
            for (int i=row-1,j=col;i>=0;i--){
                if (arr[i][j]==1){
                    return false;
                }
            }
         //Diagonally up left
            for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if (arr[i][j]==1){
                    return false;
                }
            }
        //Diagonally up left
            for (int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++){
                if (arr[i][j]==1){
                    return false;
                }
            }

            //if nothing is false return true
        return true;
        }

}
