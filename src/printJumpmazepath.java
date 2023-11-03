public class printJumpmazepath {
    public static void main(String[] args) {
        printpath(1,1,4,4,"");
    }

    public static void printpath(int sr , int sc , int dr , int dc,String psf){
        if (dr==sr && dc==sc){
            System.out.println(psf);
            return;
        }
        for (int i=1;i<=dc-sc;i++){
            printpath(sr,sc+i,dr,dc,psf+'h'+i);
        }
        for (int j=1;j<=dr-sr;j++){
            printpath(sr+j,sc,dr,dc,psf+'v'+j);
        }
        for (int i=1;i<=dr-sr&&i<=dc-sc;i++){
            printpath(sr+i,sc+i,dr,dc,psf+'d'+i);
        }

    }
}
