package Graph;

import java.util.ArrayList;

public class Bipartite2 {
    private boolean isBipartite(int node, ArrayList<ArrayList<Integer>> adj, int col,int[] color) {
        color[node] = 0; // Start coloring with color 0
        for(int it :adj.get(node)){
            if(color[it]==-1){
                if(isBipartite(it, adj, 1-col,color)==false)
                    return false; 
                
            }
            else if(color[it]==col){
                return false;
            }
        }
       return true;   
    }
    public boolean checkBipartite(int V, ArrayList<ArrayList<Integer>>adj){
        int[] color = new int[V];
        for(int i=0;i<V;i++){
            color[i] = -1; // Initialize all nodes as uncolored
        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){ // If the node is uncolored, start DFS from it
                if(isBipartite(i, adj, 0,color)==false)
                    return false; // If any component is not bipartite, return false
            }
        }
        return true;
    }
}
