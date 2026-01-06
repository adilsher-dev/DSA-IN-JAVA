package Arrays;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n; i++){
            if(arr[i] > arr[i+1]){
                System.out.println("The array is not sorted");
                break;
            }
            }
            System.out.println("The array is sorted");
            sc.close();
        }
    }

