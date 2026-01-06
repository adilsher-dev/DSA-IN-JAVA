import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int org1 = n;
        int count = 0;
        int digit = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }

        while ( org1 > 0 ){
            int rem = org1 % 10;
            digit += Math.pow(rem,count);
            org1 = org1 / 10;
        }

        if( org == digit ){
            System.out.println("This is the Armstrong Number");
        }
        else {
            System.out.println("This is not the Armstrong Number");
        }
        sc.close();
    }
}