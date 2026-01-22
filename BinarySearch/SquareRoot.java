package BinarySearch;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number n:");
        int n = sc.nextInt();

        int low = 1;
        int high = n;
        int ans = -1;

        while(low < high){
            int mid = low + (high-low)/2;

            if(mid * mid == n){
                System.out.println("The square root is:"+mid);
                return;
            }
            else if(mid * mid < n){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.println("The square root of a number is:"+ans);
        sc.close();
    }
}
