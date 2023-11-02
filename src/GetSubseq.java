import java.util.ArrayList;

public class GetSubseq {
    public static void main(String[] args) {
        String str = "Prasunivyanashutoshs";
        ArrayList<String> result = getseq(str);
        System.out.println(result);
    }

    public static ArrayList<String> getseq(String str){
        if (str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0);        //a
        ArrayList<String> str1 = getseq(str.substring(1)); //bc
        ArrayList<String> result = new ArrayList<>();
        for (int i=0;i<str1.size();i++){
            String prev = str1.get(i);
            result.add("" + prev);
            result.add(ch + prev);
        }
        return result;
    }
}
