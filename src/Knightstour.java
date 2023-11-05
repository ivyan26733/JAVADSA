
import java.util.Scanner;

public class Knightstour {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess , 2,2 , 1);

    }
    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if (r<0 || c<0 || r>=chess.length || c>= chess.length || chess[r][c] > 0){
            return;
        }
        else if(upcomingMove== chess.length* chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;

        }

        chess[r][c] = upcomingMove;
        printKnightsTour(chess,r-2 , c+1 , upcomingMove+1);//1
        printKnightsTour(chess,r-1 , c+2 , upcomingMove+1);//2
        printKnightsTour(chess,r+1 , c+2 , upcomingMove+1);//3
        printKnightsTour(chess,r+2 , c+1 , upcomingMove+1);//4
        printKnightsTour(chess,r+2 , c-1 , upcomingMove+1);//5
        printKnightsTour(chess,r+1 , c-2 , upcomingMove+1);//6
        printKnightsTour(chess,r-1 , c-2 , upcomingMove+1);//7
        printKnightsTour(chess,r-2 , c-1 , upcomingMove+1);//8
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

}
