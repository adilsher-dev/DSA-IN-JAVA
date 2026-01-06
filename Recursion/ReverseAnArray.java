import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();


        int [] arr = new int[n];

        System.out.println("Enter the array Elements :");
        for(int i =0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = 0;
        int j = n - 1;

        while(k < j){
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k++;
            j--;
        }

        for(int i = 0; i < n ; i++){
            System.out.println(arr[i]+"Reverse Array");
        }
        sc.close();
    }
}
