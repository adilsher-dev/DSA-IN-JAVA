package Arrays;
import java.util.*;

public class Altposneg {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        int n =  nums.length;

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        int [] arr = new int[n];

        for(int i = 0; i < n ; i++){

            if(nums[i] > 0){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
        }

        int index = 0;
        int low = 0;
        int high = 0;

        while(low < l1.size() && high < l2.size()){
            if(index % 2 == 0){
                arr[index] = l1.get(low);
                index++;
                low++;
            }
            else{
                arr[index] = l2.get(high);
                index++;
                high++;
            }
        }
        while (low < l1.size()) {
    arr[index++] = l1.get(low++);
}

// add remaining negatives
while (high < l2.size()) {
    arr[index++] = l2.get(high++);
}
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
