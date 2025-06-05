package Graph;

import java.util.ArrayList;

public class CycleDetection2 {
    public boolean cycledfs(int node,int parent, int [] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = 1;
        for(int adjacentNode:adj.get(node)){
            if(visited[adjacentNode] == 0){
                if(cycledfs(adjacentNode,node,visited,adj) == true){
                    return true;
                }
            }else if(adjacentNode != parent){
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int [] visited = new int[V];
        for(int i = 0; i < V; i++){
            if(visited[i] == 0){
                if(cycledfs(i,-1,visited,adj) == true){
                    return true;
                }
            }
        }
        return false;
    }
}
