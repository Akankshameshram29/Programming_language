package Graph;

import java.util.ArrayList;
//cycle detection in a directed graph using dfs
public class Directed {
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int [] visited, int []pathVis){
        visited[node]= 1;
        pathVis[node] =1;

        for(int it:adj.get(node)){
            if(visited[it]==0){
                if(dfs(it, adj, visited, pathVis)==true){
                    return true;
                }
            }
            else if(pathVis[it]==1){
                return true;
            }
        }
        pathVis[node]=0;
        return false;
    }
    
    public  boolean iscycle(int V, ArrayList<ArrayList<Integer>> adj){
        int []vis = new int[V];
        int []pathVis = new int[V];

        for(int i =0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i, adj, vis, pathVis)==true){
                    return true;
                }
            }
        }
        return false;
    }

}
