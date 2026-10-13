
public class BinarySubarrayWithSum {

    static int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            if(sum <= goal){
            count += right - left + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0};
        int goal = 0;

        int result = atMost(nums, goal) - atMost(nums, goal - 1);//bcz we need sum == goal

        System.out.println(result);
    }
}
