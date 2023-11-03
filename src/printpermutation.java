public class printpermutation {
    public static void main(String[] args) {
        String str = "Ivyanashu";
        permu(str , " ");
    }

    public static void permu(String str , String result){
        //base case
        if (str.length()==0){
            System.out.println(result);
            return;
        }


        for (int i=0;i<str.length();i++){
            //Ivyan will take each and every char I/V/Y/A/N and then rest of the string will process as it is
            char ch = str.charAt(i);

            //Now in this first char will be taken as it is but after that there will be two parts left and right part

            String leftside = str.substring(0,i);
            String rightside = str.substring(i+1);
            String total = leftside+rightside;

            //After this we will call the function and pass the respec. parameter
            permu(total , result+ch);

        }
    }

  }

