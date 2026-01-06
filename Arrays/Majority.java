package Arrays;

public class Majority {
    public static void main(String[] args) {
        int [] nums = {7,0,0,1,7,7,2,7,7};
        int n = nums.length;

        int count = 0;
        int el = nums[0];

        for(int i = 0; i < n;i++){
            if(count == 0){
                count = 1;
                el = nums[i];
            }
            else if(el == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(el);
    }
}
