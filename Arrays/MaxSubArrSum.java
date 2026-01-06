package Arrays;

public class MaxSubArrSum {
    public static void main(String[] args) {
        //brute force approach is 
//         int [] arr = {-2,-3,4,-1,-2,1,5,-3};
//         int n = arr.length;
//         int maxi = 0;
//         for(int i = 0; i < n ;i++){
//             for(int j = i;j< n;j++){
//                 int sum = 0;
//                 for(int k = i ; k <=j;k++){
//                     sum += arr[k];
//                     maxi = Math.max(maxi,sum);
//                 }
//             }
//         }
//         System.out.println("The maximum sum is:"+maxi);
//     }
// }
          //better approach is
//           int [] arr = {-2,-3,4,-1,-2,1,5,-3};
//           int n = arr.length;
//           int maxi = 0;
//           for(int i = 0; i < n ;i++){
//             int sum = 0;
//             for(int j = i;j< n;j++){
//                 sum += arr[j];
//                 maxi = Math.max(maxi,sum);
//                 }
//             }
//         System.out.println("The maximum sum is:"+maxi);
//     }
// }
//optimal approach - kadane's algorithm
            int [] arr = {-2,-3,4,-1,-2,1,5,-3};
            int n = arr.length;
            int maxi = Integer.MIN_VALUE;
            int sum = 0;

            for(int i = 0; i < n ; i++){
                sum += arr[i];

                if(sum > maxi){
                    maxi = sum;
                }

                if(sum < 0){
                    sum = 0;
                }
            }
            if(maxi == Integer.MIN_VALUE){
                System.out.println(0);
            }
            System.out.println(maxi);
        }
    }

