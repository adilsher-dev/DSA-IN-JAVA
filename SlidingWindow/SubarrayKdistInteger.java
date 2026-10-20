import java.util.*;

public class SubarrayKdistInteger {

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return ans(nums, k) - ans(nums, k - 1);
    }

    private static int ans(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];

            mpp.put(num, mpp.getOrDefault(num, 0) + 1);

            while (mpp.size() > k) {
                int numsleft = nums[left];

                mpp.put(numsleft, mpp.get(numsleft) - 1);

                if (mpp.get(numsleft) == 0) {
                    mpp.remove(numsleft);
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = subarraysWithKDistinct(nums, k);

        System.out.println("Number of subarrays with exactly "
                + k + " distinct elements: " + result);

        sc.close();
    }
}
