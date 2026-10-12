import java.util.*;
public class MaxCard{
    public static void main(String[] args){

        int [] arr = {6,2,3,4,7,2,1,7,1};

        int n = arr.length;

        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        int k = 4;

        for(int i = 0; i < k ;i++){

            lsum += arr[i];

        }

        maxSum = Math.max(maxSum,lsum+rsum);

        int rightIndex = n - 1;
        for(int i = k - 1;i >= 0;i--){
            lsum -= arr[i];
            rsum += arr[rightIndex];
            rightIndex = rightIndex - 1;
            maxSum = Math.max(maxSum,lsum+rsum);
        }
        System.out.println("maxSum:"+maxSum);
    }
}