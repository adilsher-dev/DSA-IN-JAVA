import java.util.*;

public class NearestOne {

    public int [][] nearest(int [][] grid){
        
        int n = grid.length;
        int m = grid[0].length;

        int[][] dist = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j, 0});
                    vis[i][j] = true;
                }
        }
    }

    while (!q.isEmpty()) {

            int[] curr = q.poll();

            int row = curr[0];
            int col = curr[1];
            int steps = curr[2];

            dist[row][col] = steps;

            // UP
            if (row - 1 >= 0 && !vis[row - 1][col]) {
                vis[row - 1][col] = true;
                q.offer(new int[]{row - 1, col, steps + 1});
            }

            // DOWN
            if (row + 1 < n && !vis[row + 1][col]) {
                vis[row + 1][col] = true;
                q.offer(new int[]{row + 1, col, steps + 1});
            }

            // LEFT
            if (col - 1 >= 0 && !vis[row][col - 1]) {
                vis[row][col - 1] = true;
                q.offer(new int[]{row, col - 1, steps + 1});
            }

            // RIGHT
            if (col + 1 < m && !vis[row][col + 1]) {
                vis[row][col + 1] = true;
                q.offer(new int[]{row, col + 1, steps + 1});
            }
        }

        return dist;
    }
}




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n:");

        int n = sc.nextInt();

        int [][] grid = new int[n][n];

        for(int i = 0 ; i < n ;i++){
            for(int j = 0; j <n ;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        NearestOne obj = new NearestOne();

        int [][] ans = obj.nearest(grid);
        sc.close();

    }