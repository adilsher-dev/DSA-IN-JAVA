package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //two pointer approach works when the array is sorted but when not sorted the prefixSum approach is good 
        int [] arr = {1,2,3,4,6};
        int target = 6;
        int n = arr.length;
        int [] result = new int[2];

        int low = 0;
        int high = n - 1;

        while(low < high){
            int sum = arr[low] + arr[high];

            if(sum == target){
                System.out.println(+low+ " " +high);
                return;
            }
            else if ( sum < target ){
                low++;
            }
            else{
                high--;
            }
        }
        System.out.println("No Pair Found");
    }
}

