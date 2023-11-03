public class printkpc {
    public static void main(String[] args) {
        String str = "234";
        kpc(str , " ");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void kpc(String str , String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        String charforcode = codes[ch - '0'];
        for (int i=0;i<charforcode.length();i++){
            char code = charforcode.charAt(i);//Wether solver for PQRS
            kpc(roq , ans+code);
        }
    }
}
