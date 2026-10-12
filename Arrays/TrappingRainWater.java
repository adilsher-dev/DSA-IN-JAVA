
public class TrappingRainWater {
    public static void main(String[] args){

        int [] height = {4, 2, 0, 3, 2, 5};
        int n = height.length;

        // int water = 0;

        // for(int i = 0; i < n;i++){

        //     int lmax = 0;
        //     int rmax = 0;

        //     for(int j = 0 ; j <= i;j++){
        //         lmax = Math.max(lmax,height[j]);
        //     }

        //     for(int j = i ; j < n;j++){
        //         rmax = Math.max(rmax,height[j]);
        //     }

        //     int trapped = Math.min(lmax,rmax) - height[i];

        //     if(trapped > 0){
        //         water += trapped;
        //     }
        // }

        // System.out.println(water);

        // int [] lmax = new int[n];
        // int [] rmax = new int[n];

        // lmax[0] = height[0];

        // for(int i = 1; i < n; i++){
        //     lmax[i] = Math.max(lmax[i-1],height[i]);
        // }

        // rmax[n-1] = height[n-1];

        // for(int i = n - 2; i >= 0; i--){
        //     rmax[i] = Math.max(rmax[i+1],height[i]);
        // }
        // int trapped = 0;
        // int ans = 0;

        // for(int i = 0; i < n;i++){

        //     trapped = Math.min(lmax[i],rmax[i]) - height[i];

        //     if(trapped > 0){
        //         ans += trapped;
        //     }
        // }
        // System.out.println(ans);

        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = n-1;

        int answer = 0;

        while(l < r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);

            if(lmax < rmax){
                answer += lmax - height[l];
                l++;
            }
            else{
                answer += rmax - height[r];
                r--;
            }
        }
        System.out.println(answer);
    }
}
