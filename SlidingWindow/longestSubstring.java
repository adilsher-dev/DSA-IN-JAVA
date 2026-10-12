package SlidingWindow;
import java.util.*;
public class longestSubstring{
    public static void main(String[] args){
        HashMap<Character,Integer> mpp = new HashMap<>();
        String s = "abcabcbb";
        int n = s.length();

        int left = 0;
        int maxLen = 0;

        for(int right = 0 ; right < n;right++){
            char ch = s.charAt(right);

            if(mpp.containsKey(ch)){
                left = mpp.get(ch) + 1;
            }

            mpp.put(ch,right);

            maxLen = Math.max(maxLen,right - left + 1);
        }
        System.out.println(maxLen);
    }
}