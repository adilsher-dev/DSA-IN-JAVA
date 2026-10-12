import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[]args){
        //Brute force
        String s = "AABABBA";
        int n = s.length();
        int maxLen  = 0;
        int k = 2;
        int maxFreq = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();

        // for(int i=0;i < n;i++){
        //     HashMap<Character,Integer> mpp = new HashMap<>();
        //     int maxFreq = 0;
        //     for(int j = i;j <n;j++){
        //         char ch = s.charAt(j);
        //         mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        //         maxFreq = Math.max(maxFreq,mpp.get(ch));

        //         int len = j - i + 1;

        //         if(len - maxFreq <= k){
        //             maxLen  = Math.max(maxLen,len);
        //         }
        //     }
        // }
        // System.out.println(maxLen);
        //Better 
        int left = 0;
        
        for(int right = 0 ; right < n;right++){
            char ch = s.charAt(right);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq,mpp.get(ch));

            while((right - left + 1) - maxFreq > k){

                char leftchar = s.charAt(left);
                mpp.put(leftchar,mpp.get(leftchar) - 1);
                left++;

            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
        //optimal while --> if bas ok
        

    }
}