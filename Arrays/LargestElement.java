package Arrays;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int max = Integer.MIN_VALUE;

        System.out.println("Enter the array elements:");
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);//this is the first method

        // int LarElement = arr[n-1];

        // System.out.println("This is the Largest Element:"+LarElement);

        for(int e : arr){
            if(e > max ){
                max = e;
            }
        }
            System.out.println("This is the Largest Element:"+max);
sc.close();
    }
}//T.C FOR THE FIRST CASE IS: 0(NLOGN);
//T.C FOR THE SECOND CASE IS: 0(N);