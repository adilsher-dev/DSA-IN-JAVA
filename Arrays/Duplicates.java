package Arrays;
import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        //In this question we have to return the size of the array which have unique elements 
        //2nd approach which is optimal 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the size of the array");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int index = 1;

        for(int i = 1; i < n;i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }
        System.out.println("The no.of unique elements are:"+index);
        sc.close();
    }
}
        //1st brute force approach 
        // HashSet<Integer> set = new HashSet<>();

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // int n = sc.nextInt();

        // int [] arr = new int[n];

        // System.out.println("Enter the size of the array");
        // for(int i = 0; i < n ;i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i = 0; i < n ; i++){
        //     set.add(arr[i]);
        // }

        // System.out.println("The unique elements are:"+set.size());
