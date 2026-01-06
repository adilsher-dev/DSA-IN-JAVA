import java.util.Scanner;
public class increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x++);
        System.out.println(++x);



        sc.close();
        
    }
    
}
