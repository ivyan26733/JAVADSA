public class PrintEncod {
    public static void main(String[] args) {
        Encod("123", "");
    }

    public static void Encod(String num, String result) {
        //Base case should be made smartly for cases like 303,103,993,013 etc
        if (num.length() == 0) {
            System.out.println(result);
            return;
        } else if (num.length() == 1) {
            char ch = num.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int charval = ch - '0';
                char code = (char) ('a' + ch - 1);
                result = result + code;//If we dont have the list of codes than this should be written as -> (char)('a' + ch - 1)
                System.out.println(result);
            }
        }
        //If we have len > 3;
         else {
            //Firstly we seperate 1st element of String
            char ch = num.charAt(0);
            String roq = num.substring(1);
            if (ch == '0') {
                return;
            } else {
                int charval = ch - '0';
                char code = (char) ('a' + ch - 1);
//                result = result  + code;//If we dont have the list of codes than this should be written as -> (char)('a' + ch - 1)
                Encod(roq, result + code);
            }

            //Secondaly Seperate rest of the String but first and second only
            String str = num.substring(0, 2);
            String roq1 = num.substring(2);
            int chv12 = Integer.parseInt(str);
            if (chv12 <= 26) {
                char code = (char) ('a' + chv12 - 1);
                Encod(roq1, result + code);
            }
        }
    }
}