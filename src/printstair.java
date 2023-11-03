public class printstair {
    public static void main(String[] args) {
            int n = 100;
            stairPath(n , "");
    }
    public static void stairPath(int n , String path){
        if (n<0){
            return;
        }
        if (n==0){
            System.out.println(path);
            return;
        }

//        stairPath(n-1,path+'1');
//        stairPath(n-2,path+'2');
//        stairPath(n-3,path+'3');

        //or if we dont want to add these recursive function manally , apply for loop for that
        for (int i=1;i<=n;i++){
            stairPath(n-i , path+i);
        }
    }
}
