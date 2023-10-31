import java.util.ArrayList;

public class Mazepathjump {
    public static void main(String[] args) {
        int dr = 3;
        int dc = 3;
        ArrayList<String> path = Mazejump(1, 1, dr, dc);
        System.out.println(path);
    }

    public static ArrayList<String> Mazejump(int sr, int sc, int dr, int dc) {
//        if (sr > dr || sc>dc){
//            ArrayList<String> stop = new ArrayList<>();
//            return stop;
//        }
        if (sr == dr && sc == dc) {
            ArrayList<String> reached = new ArrayList<>();
            reached.add("");
            return reached;
        }

        ArrayList<String> paths = new ArrayList<>();
        //Horizontal Moves
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> pathH = Mazejump(sr, sc + ms, dr, dc);

            for (int i = 0; i < pathH.size(); i++) {
                String path = pathH.get(i);
                paths.add("H" + ms+path);

            }

        }
        //Verical Moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> pathV = Mazejump(sr + ms, sc, dr, dc);

            for (int i = 0; i < pathV.size(); i++) {
                String path = pathV.get(i);
                paths.add("V" + ms+ path);
            }
        }
        //Diagnal Moves
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> pathd = Mazejump(sr + ms, sc + ms, dr, dc);

            for (int i = 0; i < pathd.size(); i++) {
                String path = pathd.get(i);
                paths.add("d" + ms+ path);

            }

        }

        return paths;
    }

}
