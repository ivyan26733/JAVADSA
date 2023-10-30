import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
    int dr = 3;
    int dc = 3;
    ArrayList<String> path = mazep(1,1,dr,dc);
        System.out.println(path);
    }

    public static ArrayList<String> mazep(int sr , int sc , int dr, int dc){
        if (sr > dr || sc>dc){
            ArrayList<String> stop = new ArrayList<>();
            return stop;
        }
        if (sr == dr && sc==dc){
            ArrayList<String> reached = new ArrayList<>();
            reached.add("");
            return reached;
        }

        ArrayList<String> path1 = mazep(sr+1 , sc , dr , dc);
        ArrayList<String> path2 = mazep(sr , sc+1 , dr , dc);
        ArrayList<String> paths = new ArrayList<>();

        for (int i=0 ; i<path1.size();i++){
            String path = path1.get(i);
            paths.add("h" + path);
        }
        for (int i=0 ; i<path2.size();i++){
            String path = path2.get(i);
            paths.add("v" + path);
        }
        return paths;
    }
}
