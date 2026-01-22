package BinarySearch;
import java.util.Scanner;

public class NthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int low = 1;
        int high = M;
        int ans  = -1;

        while(low <= high){
            int mid  = low + (high - low)/2;

            double value = Math.pow(mid,N);

            if(value == M){
                System.out.println(mid);
                return;
            }
            else if(value < M){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
}
