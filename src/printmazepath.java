public class printmazepath {
    public static void main(String[] args) {
        mazepath(1,1,4,4,"");
    }

    public static void mazepath(int sr , int sc , int dr , int dc,String psf){
        if (sr>dr || sc>dc){
            return;
        }
        if (dr==sr && dc==sc){
            System.out.println(psf);
            return;
        }

        mazepath(sr+1,sc,dr,dc,psf+'v');
        mazepath(sr,sc+1,dr,dc,psf+'h');
    }
}
