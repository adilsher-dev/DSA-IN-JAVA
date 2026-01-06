package Arrays;

public class MaxCons {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1};
        
        //int n = arr.length;

        int maxi = 0;
        int count = 0 ;

        for(int num : arr){
            if(num == 1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else{
                count = 0;
            }
        }
        System.out.println("This is the MaxConsCount:"+maxi);
    }
}
