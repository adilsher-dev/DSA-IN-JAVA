package Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the Target value:");
        int target = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the size of the array");
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int index = -1;

        for(int i = 0; i < n ; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("This is required index of the target:"+index);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
