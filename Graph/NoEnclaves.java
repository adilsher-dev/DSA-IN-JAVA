public class NoEnclaves {
    public static int enclaves(int [][] grid){

        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n;i++){
            if(grid[i][0] == 1){
               // dfs(grid,i,0);
            }
            if(grid[i][m-1] == 1){
                //dfs(grid,i,m-1);
            }
        }

        for(int j = 0; j < m; j++){
            if(grid[0][j] == 1){
              //  dfs(grid,0,j);
            }
            if(grid[n-1][j] == 1){
                //dfs(grid,n-1,j);
            }
        }

        int count  = 0;

        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(int [][] grid ,int row,int col){
        int n  = grid.length;
        int m  = grid[0].length;

        if(row < 0 || col < 0 || row >= n || row >= m){
            return;
        }

        grid[row][col] = 0;

        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }


    public static void main(String [] args){


    }
}
