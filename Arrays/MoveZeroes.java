package Arrays;
import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        //this is the optimal approach
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }

        int index =  0;

        for(int i = 0; i < n ;i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }

        for(int i = index ; i<n;i++){
            arr[i] = 0;
        }

        for(int e : arr){
            System.out.print(+e + " ");
        }


        //This is brute force approach
        // List<Integer> list = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // int n = sc.nextInt();

        // int [] arr = new int[n];

        // System.out.println("Enter the array elements:");
        // for(int i = 0 ; i < n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int count = 0 ;

        // for(int e : arr){
        //     if(e != 0){
        //         list.add(e);
        //         count++;
        //     }
        // }

        // for(int i = count;i < n ;i++){
        //     list.add(0);
        // }

        // for(int i = 0; i < list.size() ;i++){
        //    System.out.print(list.get(i)+" ");
        // }
        sc.close();
    }
}
