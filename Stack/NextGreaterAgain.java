import java.util.*;
public class NextGreaterAgain {
    public static void main(String[] args){
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};

        int [] arr = new int[nums1.length + nums2.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                mpp.put(st.pop(),num);
            }
            st.push(num);
        }

        while(!st.isEmpty()){
            mpp.put(st.pop(),-1);
        }
        int i = 0;

        for(int num: nums1){
            arr[i++] = mpp.get(num);
        }
        System.out.print("{");
        for(int j = 0; j < i;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print("}");
    }
}
