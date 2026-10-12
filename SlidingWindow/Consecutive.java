public class Consecutive {
    public static void main(String[] args){
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int n = arr.length;
        int k = 2;

        int left = 0;
        int maxLen = 0;

        for(int right = 0;right < n;right++){

            if(arr[right] == 0){
                k--;
            }

            while(k < 0){
                if(arr[left] == 0){
                    k++;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println("The length :"+maxLen);
    }
}
