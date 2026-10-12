import java.util.*;
public class Provinces {

    public static void dfs(int node,boolean [] visited,int [][]isConnected){

        visited[node] = true;

        for(int i = 0 ; i < isConnected.length;i++){
            if(isConnected[node][i] == 1 && !visited[i]){
                dfs(i,visited,isConnected);
            }
        }
    }

    public static int provinces(int[][] isConnected){

        int n = isConnected.length;

        boolean [] ans = new boolean[n];

        int provincesss = 0;

        for(int i = 0; i < n ;i++){

            if(!ans[i]){
                dfs(i,ans,isConnected);
                provincesss++;
            }
        }
        return provincesss;
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n:");

        int n = sc.nextInt();

        int [][] isConnected = new int[n][n];

        for(int i = 0 ; i < n ;i++){
            for(int j = 0; j <n ;j++){
                isConnected[i][j] = sc.nextInt();
            }
        }

        int ans = provinces(isConnected);

        System.out.println("The no.of provinces are:"+ans);

        sc.close();
    }
}