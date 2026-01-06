package Arrays;
import java.util.*;

public class Longest_NegPos {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int[] arr = {10, 5, 2, 7, 1, -10, 9};
        int k = 15;
        int n = arr.length;

        int prefixSum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            prefixSum += arr[i];

            if(prefixSum == k){// 0 to i....
                maxLen = i + 1;
            }

            if(mpp.containsKey(prefixSum - k)){// 
                int len = i - mpp.get(prefixSum - k);
                maxLen = Math.max(maxLen,len);
            }


            if(!mpp.containsKey(prefixSum)){
                mpp.put(prefixSum,i);
            }
        }
        System.out.println("The Len of Longest Subarray is:"+maxLen);
    }
}
