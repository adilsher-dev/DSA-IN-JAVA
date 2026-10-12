import java.util.*;
//brute me nse array and pse array banao with func call and after that ek forloop lagakar har index ki computation karlo 
public class LargestRectangle {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        int [] arr  = {2,1,5,6,2,3};
        int n = arr.length;
        int nse = -1;
        int pse = -1;
        int el = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < n;i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){

                el = s.peek();

                s.pop();

                nse = i;

                pse = s.isEmpty() ? -1 : s.peek();
                
                maxi = Math.max(maxi,arr[el] * (nse - pse - 1));

            }
            s.push(i);
        }

        while(!s.isEmpty()){
            el  = s.peek();
            s.pop();

            nse = n;
            pse = s.isEmpty() ? -1 : s.peek();
            maxi = Math.max(maxi,arr[el] * (nse - pse - 1));
        }
        System.out.println(maxi);
    }
}
