package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Check for Bipartite Graph using BFS

public class Bipartite {
    private boolean isBipartite(int start,ArrayList<ArrayList<Integer>>adj,int [] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0; // Start coloring with color 0

        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for( int it:adj.get(node)){
                if(color[it] == -1){
                    color[it] = 1 - color[node]; // Assign opposite color to the adjacent node
                    q.add(it);
                } else if (color[it] == color[node]) {
                    return false; // If the adjacent node has the same color, it's not bipartite
                }
            }
        }
        return true; // All nodes can be colored with two colors
    }

    public boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int V) {
        int [] color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1; 
        }

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) { // If the node is uncolored, start BFS from it
                if (!isBipartite(i, adj, color)) {
                    return false; // If any component is not bipartite, return false
                }
            }
        }
        return true; 
    }
}
