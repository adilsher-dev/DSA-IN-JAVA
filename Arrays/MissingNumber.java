package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {3,0,1};

        int n =  arr.length;

        int total = (n * (n+1) )/ 2;

        int sum = 0;
        for(int i = 0; i < n ; i++){
            sum += arr[i];
        }
        System.out.println("Missing Number:"+(total - sum));
    }
}
