package SlidingWindow;
import java.util.*;
public class longestSubstring {
    public static void main(String[] args) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        String s = "abcabcbb";
        
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char ch  = s.charAt(right);

            if(mpp.containsKey(ch)){
                left = Math.max(left,mpp.get(ch)+1);
            }

            mpp.put(ch,right);

            maxLen = Math.max(maxLen,right-left+1);

        }
        System.out.println("the longest substring length is:"+maxLen);
        
    }
    
}
