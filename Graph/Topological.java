
import java.util.*;

public class Topological {

    public static void dfs(int node, int[][] graph, boolean[] vis, Stack<Integer> st) {

        vis[node] = true;

        for (int i = 0; i < graph.length; i++) {

            if (graph[node][i] == 1 && !vis[i]) {
                dfs(i, graph, vis, st);
            }
        }

        st.push(node);
    }

    static void topologicalSort(int[][] graph) {

        int n = graph.length;

        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {
                dfs(i, graph, vis, st);
            }
        }

        System.out.println("Topological Order:");

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {

        int[][] graph = {

            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0}
        };

        topologicalSort(graph);
    }
}