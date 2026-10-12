import java.util.*;

public class KahnAlgorithm {

    public static void topologicalSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] indegree = new int[V];//we make a array first 

        // Calculate indegree of each node
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add nodes having indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo.add(node);

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println("Topological Order:");
        for (int node : topo) {
            System.out.print(node + " ");
        }
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Graph edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        topologicalSort(V, adj);
    }
}