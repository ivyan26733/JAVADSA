import java.util.Scanner;

public class FloodFillSol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][] visited) {
        //Either Write code smartly or write base case smartly

        //base case -> Keep in mind normal things that it should not go out of the array bounds
        //Keep track on visited blocks
        //Check wether it is empty   simply return
        //Remember to follow the order
        if (sr<0||sc<0||sr==maze.length || sc==maze.length || maze[sr][sc]==1|| visited[sr][sc]==true){
            return;
        }

        //Check wether you have reached or not
        if (sr == maze.length-1 && sc == maze.length-1){
            System.out.println(asf);
            return;
        }

        //Before calling the function mark the block wether amrked or not
        visited[sr][sc] = true;
        //Now calling the function would be normal as we have done in maze
        //Top
        floodfill(maze , sr+1 , sc , asf+'T' , visited);
        //left
        floodfill(maze , sr , sc-1 , asf+'L' , visited);
        //down
        floodfill(maze , sr+1 , sc , asf+'D' , visited);
        //right
        floodfill(maze , sr , sc+1 , asf+'R' , visited);
        //After calling , unamrk all the boxes to allow further paths to form
        visited[sr][sc] = false;

    }
}
