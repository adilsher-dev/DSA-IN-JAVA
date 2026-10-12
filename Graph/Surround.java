import java.util.*;

public class Surround{

    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        // First and Last Column
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);

            if (board[i][m - 1] == 'O')
                dfs(board, i, m - 1);
        }

        // First and Last Row
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);

            if (board[n - 1][j] == 'O')
                dfs(board, n - 1, j);
        }

        // Convert surrounded O's to X
        // Convert # back to O
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {

        int n = board.length;
        int m = board[0].length;

        if (row < 0 || col < 0 || row >= n || col >= m)
            return;

        if (board[row][col] != 'O')
            return;

        board[row][col] = '#';

        dfs(board, row - 1, col); // Up
        dfs(board, row + 1, col); // Down
        dfs(board, row, col - 1); // Left
        dfs(board, row, col + 1); // Right
    }

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        Surround obj = new Surround();
        obj.solve(board);

        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
