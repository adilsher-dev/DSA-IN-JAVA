package Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the arr elements:");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < k; i++){//first step is done...

            int low = 0 ;
            int high = k - 1;
            while( low < high ){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        for(int i = n - k ; i < n; i++){// second step is done...

            int low = n - k ;
            int high = n - 1;
            while( low < high ){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        for(int i = 0 ; i < n ; i++){

            int low = 0 ;
            int high =  n - 1;
            while( low < high ){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }


        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);

        }

        sc.close();
    }
}
