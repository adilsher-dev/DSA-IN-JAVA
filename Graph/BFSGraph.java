import java.util.*;

public class BFSGraph {

    static void bfs(int start,ArrayList<ArrayList<Integer>> graph,boolean [] visited){
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()){

            int node = q.poll();
            System.out.println(node + " ");

            for(int neighbor: graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<V ;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        
        graph.get(1).add(3);
        
        graph.get(2).add(4);

        boolean [] visited = new boolean[V];

        bfs(0,graph,visited);
    
    }
}
