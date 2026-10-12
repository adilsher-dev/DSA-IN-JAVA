import java.util.*;
public class FRUITS {
    public static void main(String[] args){
        int [] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int n = fruits.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for(int r = 0 ; r < n;r++){
            int fruit = fruits[r];
            mpp.put(fruit,mpp.getOrDefault(fruit,0)+1);

            if(mpp.size() > 2){//while to if we dont need max window at every step thats why if is better choice for ourself
                int leftfruit = fruits[l];
                mpp.put(leftfruit,mpp.get(leftfruit)-1);
                if(mpp.get(leftfruit) == 0){
                    mpp.remove(leftfruit);
                }
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        System.out.println(maxLen);
    }
}
