//Incomplete

import java.util.ArrayList;

public class GetKps {
    public static void main(String[] args) {
        String str = "234";
        ArrayList<String> result = Kpc(str);
        System.out.println(result);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> Kpc(String str){
        if (str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        //234
        char ch = str.charAt(0);  //2
        String substr = str.substring(1); //34
        ArrayList<String> rescur = Kpc(substr);
        ArrayList<String> mres =  new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for (int i=0;i<codeforch.length();i++){
            char code = codeforch.charAt(i);
            for (int j=0;j<rescur.size();j++){
                String str1 = rescur.get(j);
                mres.add(code + str1);
            }
        }
        return mres;
    }
}
