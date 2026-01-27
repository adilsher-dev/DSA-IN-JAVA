package Stack;
import java.util.*;

public class Asteroid {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int [] nums = {4,7,1,1,2,-3,-7,17,15,-18,-19};
        int n = nums.length;

        for(int num : nums){
            boolean destroyed = false;//if stack becomes empty and for the large cases

            while(!st.isEmpty() && st.peek() > 0 && num < 0){

                if(Math.abs(num) > Math.abs(st.peek())){
                    st.pop();
                    continue;
                }
                else if(Math.abs(num) == Math.abs(st.peek())){
                    st.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                st.push(num);
            }
        }
        int [] result = new int[st.size()];
        for(int i = st.size() - 1 ; i >= 0;i--){
            result[i] = st.pop();
        }
        System.out.print("{");
        for(int i = 0; i < result.length;i++){
            System.out.print(+result[i] + " ");
        }
        System.out.print("}");
    }
}
