import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(10);
        arr.add(100);
        arr.add(2145);
        arr.add(3435);
        arr.add(34);

        for (int i=0;i<5;i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println("SubList is"+" "+arr.subList(2,6));
        System.out.println(arr.get(2));
        System.out.println(arr.set(4,45));
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}
