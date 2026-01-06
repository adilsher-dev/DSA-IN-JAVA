package Arrays;
//Dutch National Flag Algorithm

public class Sort012 {
    static void swap(int [] arr ,int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b]= temp;
}
    public static void main(String[] args) {

        int [] nums = {2, 0, 2, 1, 1, 0};
        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){

            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        System.out.println("This is the resultant array");
        for(int i = 0; i < n;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
