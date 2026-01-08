package Arrays;

public class Rotate90Mat {
    public static void main(String[] args) {
        //simple logic transpose + reverse each row
        int mat[][] = {{1 , 2 , 3},
{4 , 5 , 6},
{7 , 8 , 9}};

        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; i < n;i++){
            for(int j = i; j < n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }


        for(int i = 0;i<n;i++){
            int left = 0;
            int high = n - 1;

            int temp = mat[i][left];
            mat[i][left] = mat[i][high];
            mat[i][high] = temp;
            left++;
            high--;
        }
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
    }
}
}
