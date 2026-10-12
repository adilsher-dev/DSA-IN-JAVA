import java.util.*;
public class LongestSubStringatmostK {
    public static void main(String[] args){
        String s = "aaabbcccd";
        int n = s.length();
        int k = 2;
        HashMap<Character,Integer> mpp = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for(int r=0; r<n;r++){

            char ch = s.charAt(r);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);

            while(mpp.size() > k){
                char leftch = s.charAt(l);
                mpp.put(leftch,mpp.get(leftch)-1);
                if(mpp.get(leftch) == 0){
                    mpp.remove(leftch);
                }
                l++;
            }
            if(mpp.size() == k){
                maxLen = Math.max(maxLen,r-l+1);
            }
        }
        System.out.println(maxLen);
    }
}
