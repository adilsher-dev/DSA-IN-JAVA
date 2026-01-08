package Arrays;
import java.util.*;

public class Spiral {
    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        List<Integer> list = new ArrayList<>();

        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {

            // left -> right
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            // right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            // bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        System.out.println(list);
    }
}

