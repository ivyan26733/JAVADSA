public class TowerOfhanoi {
    public static void main(String[] args) {
        int n =10;
        char source = 'A';
        char auxi = 'B';
        char destination = 'C';
        long starttime = System.currentTimeMillis();
        toh(n,source,auxi,destination);
        long endtime = System.currentTimeMillis();
        System.out.println("Total TimeTaken " + (endtime-starttime)/1000 + " Seconds" );
    }

    public static void toh(int n , char source , char auxi , char destination){
        //Base case should be like that if disc left is 1
        if (n==1){
            System.out.println("Move disk 1 from" + source + "to" + destination);
            return;
        }

        toh(n-1 , source , destination , auxi);
        System.out.println("Move disk " + n + " from " + source +" to " + destination);
        toh(n-1,auxi,source,destination);

    }
}
