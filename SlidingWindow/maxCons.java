package SlidingWindow;

public class maxCons {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for(int right = 0; right < arr.length;right++){

            if(arr[right] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            if(right - left + 1 > maxLen){
                maxLen = right - left + 1;
            }


        }
        System.out.println("maxLEN"+maxLen);  
    }
}
