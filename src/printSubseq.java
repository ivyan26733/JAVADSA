public class printSubseq {
    public static void main(String[] args) {
        String str = "IvyanPrasunAshutoshGarvShubhamLavkush";
        printseq(str , "");

    }
    public static void printseq(String str , String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String roq = str.substring(1);

        //Yes call
        printseq(roq , ans + ch);
        //No call
        printseq(roq , ans+"");
    }
}
