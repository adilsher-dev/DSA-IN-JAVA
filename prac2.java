import java.util.Scanner;
//check whether the given number is integer or not
public class prac2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println("The given number is "+n);
        }
        else {
            System.out.println("not");
        }

        sc.close();


    }
}
