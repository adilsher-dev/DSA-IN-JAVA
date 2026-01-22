package Arrays;
import java.util.Scanner;

public class MatrixMaxOne {
    public int lowerbound(int [] arr,int cols, int x){
        int low = 0;
        int high = cols - 1;
        int ans = cols;
        while(low <= high){
            int mid  = low + (high - low)/2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int returnThatRow(int [][] mat,int rows,int cols){
        int maxCount = 0;
        int index = -1;

        for(int i = 0; i < rows;i++){
            int oneCount = cols - lowerbound(mat[rows], cols, 1);
        if(oneCount > maxCount){
            maxCount = oneCount;
            index  = i;

        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of cols");
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        MatrixMaxOne obj = new MatrixMaxOne();
        int result = obj.returnThatRow(matrix, rows, cols);

        System.out.println("Row with maximum number of 1s is: " + result);

        sc.close();
    }
}