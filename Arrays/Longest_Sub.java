package Arrays;

public class Longest_Sub {
    public static void main(String[] args) {
        int [] arr = {10,5,2,7,1,9};

        int k = 15;
        int n = arr.length;
        int low = 0;
        int high = 0;
        int maxi = 0;

        int sum = 0;

        while(high < n){
            sum += arr[high];

            while(sum > k){
                sum -= arr[low];
                low++;
            }
            if(sum  == k){
                maxi = Math.max(maxi,(high + low - 1));
            }
            high++;
        }
        System.out.println("The longest Subarray:"+maxi);
    }
}



