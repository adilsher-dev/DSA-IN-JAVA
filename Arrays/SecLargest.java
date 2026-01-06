package Arrays;
import java.util.Scanner;

public class SecLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array elements here:");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int Largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        if( n < 2 ){
            System.out.println(-1);
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > Largest){
                secLargest = Largest;
                Largest = arr[i];
            }
            else if (arr[i] > secLargest && arr[i] != Largest){
                secLargest = arr[i];
            }
        }

        if(secLargest == Integer.MIN_VALUE){
            System.out.println(-1);
        }

        System.out.println("The Second Largest Element is:"+secLargest);
        //this is the brute force approach for this question
        // HashSet<Integer> set = new HashSet<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // int n = sc.nextInt();

        // int [] arr = new int[n];

        // System.out.println("Enter the array elements:");
        // for(int i = 0 ; i < n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int e : arr){
        //     set.add(e);
        // }
        // List<Integer> list = new ArrayList<>(set);
        // //this is the method how we can move the set elements into the list
        // int l = list.size();
        // Collections.sort(list);

        // if(list.size() < 2){
        //     System.out.println(-1);
        // }
        // else{
        //     System.out.println("The  Second Largest Element of the array:"+list.get(l-2));
        // }
        sc.close();
    }
}
