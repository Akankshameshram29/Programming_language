
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Helper Pair class
class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class CycleDetection {

    public boolean cyclebfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        visited[src] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for (int adjacentNode : adj.get(node)) {
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    q.add(new Pair(adjacentNode, node));
                } 
                else if (adjacentNode != parent) {
                    return true;  // Cycle detected
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (cyclebfs(i, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Main class to test the Cycle Detection
class Main {
    public static void main(String[] args) {
        CycleDetection graph = new CycleDetection();

        // Test Case 1: Graph with a cycle
        int V1 = 5;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) {
            adj1.add(new ArrayList<>());
        }

        // Adding edges
        adj1.get(0).add(1);
        adj1.get(1).add(0);

        adj1.get(1).add(2);
        adj1.get(2).add(1);

        adj1.get(2).add(3);
        adj1.get(3).add(2);

        adj1.get(3).add(4);
        adj1.get(4).add(3);

        adj1.get(4).add(1); // This edge creates a cycle

        System.out.println("Test Case 1: " + (graph.isCycle(V1, adj1) ? "Cycle Detected" : "No Cycle Detected"));

        // Test Case 2: Graph without a cycle
        int V2 = 4;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }

        adj2.get(0).add(1);
        adj2.get(1).add(0);

        adj2.get(1).add(2);
        adj2.get(2).add(1);

        adj2.get(2).add(3);
        adj2.get(3).add(2);

        System.out.println("Test Case 2: " + (graph.isCycle(V2, adj2) ? "Cycle Detected" : "No Cycle Detected"));
    }
}
