import java.util.ArrayList;

public class GetStairsPath {
    public static void main(String[] args) {
        int num = 3;

        ArrayList<String> arr = pathnum(num);
        System.out.println(arr);
    }

    public static ArrayList<String> pathnum(int num){
        if (num==0){
            ArrayList<String> nstep = new ArrayList<>();
             nstep.add("");
             return nstep;
        }
        if (num<0){
            ArrayList<String> negstep = new ArrayList<>();
            return negstep;
         }

        ArrayList<String> path1 =pathnum(num-1);
        ArrayList<String> path2 =pathnum(num-2);
        ArrayList<String> path3 =pathnum(num-3);
        ArrayList<String> paths = new ArrayList<>();

        for (int i = 0; i< path1.size(); i++){
            String path = path1.get(i);
             paths.add("1"+path);
        }
        for (int i = 0; i< path2.size(); i++){
            String path = path2.get(i);
            paths.add("2"+path);
        }
        for (int i = 0; i< path3.size(); i++){
            String path = path3.get(i);
            paths.add("3"+path);
        }

        return paths;

    }
}
