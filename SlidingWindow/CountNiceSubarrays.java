
public class CountNiceSubarrays{

    static int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += (nums[right] % 2);

            while (sum > goal) {
                sum -= (nums[left]%2);
                left++;
            }
            if(sum <= goal){
            count += right - left + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int goal = 3;

        int result = atMost(nums, goal) - atMost(nums, goal - 1);//bcz we need sum == goal

        System.out.println(result);
    }
}
