import java.util.*;
public class StringContainsThreeChar {
    public static void main(String[] args){
        //brute
        // String s = "abcabac";
        // int count  = 0;
        // int n = s.length();

        // for(int  i = 0; i < n;i++){
        //     for(int j = i; j < n;j++){
        //         boolean a = false;
        //         boolean b = false;
        //         boolean c = false;
        //         for(int k = i; k <=j;k++){
        //             if(s.charAt(k) == 'a'){
        //                 a = true;
        //             }
        //             if(s.charAt(k) == 'b'){
        //                 b = true;
        //             }
        //             if(s.charAt(k) == 'c'){
        //                 c = true;
        //             }
        //         }
        //         if(a && b && c){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        //better --> agar woh string valid hai to uske aage ki bhi valid hongi saari n-j add krdo har count me
        

        // for(int  i = 0; i < n;i++){
        //     boolean a = false;
        //     boolean b = false;
        //     boolean c = false;
        //     for(int j = i; j < n;j++){
        //         if(s.charAt(j) == 'a'){
        //             a = true;
        //         }
        //         if(s.charAt(j) == 'b'){
        //             b = true;
        //         }
        //         if(s.charAt(j) == 'c'){
        //             c = true;
        //         }
        //     if( a && b && c){
        //         count += n - j;
        //         break;
        //     }
        // }
        // }
        // System.out.println(count);
        HashMap<Character,Integer> mpp = new HashMap<>();

        String s = "abcabc";
        int n = s.length();
        int left = 0;
        int count = 0;

        for(int right = 0 ; right < n;right++){
            char ch = s.charAt(right);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);

            while(mpp.get('a',0) > 0 && mpp.get('b',0) && mpp.get('c',0)){
                count += n -j;

                char leftchar = s.charAt(left);
                mpp.put(leftchar,mpp.get(leftchar) - 1);
                left++;

            }
        }
        System.out.println(count);
    }
}
