public class addMatrices {
    public static void main(String[] args) {
        int [][] matrix1 = {{1,2,3},{4,5,6}};
        int [][] matrix2 = {{7,8,9},{1,2,3}};

        int [][] sum = new int[2][3];

        for(int i = 0 ; i < 2;i++){
            for(int j = 0; j < 3;j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The result sum matrix");

        for(int i = 0; i < 2;i++){
            for(int j=0;j<3;j++){
                System.out.println(sum[i][j]);
            }
        }






    }
}
