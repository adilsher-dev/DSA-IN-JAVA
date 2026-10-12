class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];

        dfs(image,sr,sc,color,image[sr][sc]);

        return image;
    }
    
    private void dfs(int [][] image,int sr,int sc,int newColor,int orgColor){
        int m = image.length;
        int n = image[0].length;

        if(sr < 0 || sc < 0 || sr >= m || sc >= n){//out of bound
            return;
        }
        if(image[sr][sc] != orgColor){ //same place
            return;
        }
        if(image[sr][sc] == newColor){ //color update already
            return;
        }

        image[sr][sc] = newColor;

        dfs(image, sr + 1, sc, newColor,orgColor);
        dfs(image, sr - 1, sc, newColor, orgColor);
        dfs(image, sr, sc + 1, newColor, orgColor);
        dfs(image, sr, sc - 1, newColor,orgColor);
    }
}