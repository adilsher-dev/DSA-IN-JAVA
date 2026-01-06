package Arrays;

public class Union {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {1,2,7};
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] arr = new int[n1+n2];

        int i = 0;
        int j = 0;
        int index = 0;

        while(i < n1 && j < n2){

            if(nums1[i] == nums2[j]){
                if(index == 0 || arr[index - 1] != nums1[i]){
                arr[index++] = nums1[i];
            }
                i++;
                j++;
                
            }
            else if(nums1[i] < nums2[i]){
                if(index == 0 || arr[index - 1] != nums1[i]){
                arr[index++] = nums1[i];
                }
                i++;
            }
            else{
                if(index == 0 || arr[index - 1] != nums1[i]){
                arr[index++] = nums2[i];
                }
                j++;
            }
        }
        while(i < n1){
            arr[index++] = nums1[i];
            i++;
        }
        while(j < n2){
            arr[index++] = nums2[j];
            j++;
        }

        for(int k= 0 ; k < index;k++){
            System.out.print(+arr[k] + " ");
        }
    }
}
    
