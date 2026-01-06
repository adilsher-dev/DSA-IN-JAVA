import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n <= 1){
            isPrime = false;
        }

        for(int i = 2; i < Math.sqrt(n);i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("This is a Prime Number");
        }
        else{
            System.out.println("This is not a Prime Number");
        }
        sc.close();
    }
}
