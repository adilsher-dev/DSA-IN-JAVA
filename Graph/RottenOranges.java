import java.util.*;
public class RottenOranges {
    static class Pair {

        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {

            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int gridOranges(int [][] grid){

        int n  = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        int fresh = 0;

        for(int i = 0; i < n ; i++){
            for(int j = 0;j < m ; j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j,0));
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int time = 0;

        while(!q.isEmpty()){
            Pair current = q.poll();

            int row = current.row;
            int col = current.col;
            int t = current.time;

            time = Math.max(time,t);

        if (row - 1 >= 0 && grid[row - 1][col] == 1) {

                grid[row - 1][col] = 2;

                fresh--;

                q.offer(new Pair(row - 1, col, t + 1));
            }

            // DOWN

            if (row + 1 < n && grid[row + 1][col] == 1) {

                grid[row + 1][col] = 2;

                fresh--;

                q.offer(new Pair(row + 1, col, t + 1));
            }

            // LEFT

            if (col - 1 >= 0 && grid[row][col - 1] == 1) {

                grid[row][col - 1] = 2;

                fresh--;

                q.offer(new Pair(row, col - 1, t + 1));
            }

            // RIGHT

            if (col + 1 < m && grid[row][col + 1] == 1) {

                grid[row][col + 1] = 2;

                fresh--;

                q.offer(new Pair(row, col + 1, t + 1));
            }
        }

        if (fresh > 0) {

            return -1;
        }

        return time;
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n:");

        int n = sc.nextInt();

        int [][] grid = new int[n][n];

        for(int i = 0 ; i < n ;i++){
            for(int j = 0; j <n ;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = gridOranges(grid);
        sc.close();
    }
}