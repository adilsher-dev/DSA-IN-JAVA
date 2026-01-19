package BinarySearch;

public class SingleElement {
    public static void main(String[] args) {
        //1st approach is this using the hashmap
//         HashMap<Integer,Integer> mpp = new HashMap<>();

//         int [] nums = {1,1,2,3,3,4,4,8,8};
//         int n = nums.length;

//         for(int num : nums){
//             mpp.put(num , mpp.getOrDefault(num,0)+1);
//         }

//         for(Map.Entry<Integer,Integer> entry : mpp.entrySet() ){
//             if(entry.getValue() == 1){
//                 System.out.println("The Unique element is:"+entry.getKey());
//                 break;
//             }
//         }
//     }
// }
            //2nd approach is this 
//             int [] nums = {1,1,2,3,3,4,4,8,8};
//             int n = nums.length;

//             int result = nums[0];

//             for(int i = 1 ; i < n ; i++){
//                 result = result ^ nums[i];
//             }

//             System.out.println("The unique element is :"+result);
//     }
// }
        // int [] nums = {1,1,2,3,3,4,4,8,8};
        // int n= nums.length;

        // int low = 0;
        // int high = n - 1;

        // while( low < high ){
        //     int mid = low + (high - low)/2;

        //     if(nums[low] == nums[low+1] && nums[high] == nums[high - 1]){
        //         low += 2;
        //         high -= 2;
        //     }

        //     if(nums[low] != nums[low+1] && nums[high] == nums[high-1]){
        //         high -= 2;
        //     }
        //     else{
        //         low += 2;
        //     } 
        // }
        // System.out.println("The unique element is:"+nums[low]);
        //optimal solution using the indexing method
        int [] nums = {1,1,2,2,3,3,4,5,5,6,6};
        int n = nums.length;

        if(n == 1){
            System.out.println(nums[0]);
        }
        else if(nums[0] != nums[1]){
            System.out.println(nums[0]);
        }
        else if(nums[n-1] != nums[n-2]){
            System.out.println(nums[n-1]);
        }

        int low = 1;
        int high = n - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                System.out.println("nums[mid]:"+nums[mid]);
            }

            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
