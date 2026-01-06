import java.util.Scanner;
import java.util.*;

public class Divisors {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        for(int i = 1; i < n; i++){
            if( n % i == 0){
                list.add(i);
            }
        }
        System.out.print("[");
        for(int i = 0 ; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("]");
        sc.close();
    }
}
