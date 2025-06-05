package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    private static void dfs(int node, int []visited,Stack<Integer>st,ArrayList<ArrayList<Integer>>adj){
         visited[node]=1;
         for(int it:adj.get(node)){
            if(visited[it]==0){
                dfs(it, visited, st, adj);
            }
         }
    }
    static int [] topoSort(int V,ArrayList<ArrayList<Integer>>adj){
        int [] visited = new int[V];
        Stack<Integer>st = new Stack<Integer>();
        for(int i =0;i<V;i++){
            if(visited[i]==0){
                dfs(i,visited,st,adj);
            }
        }

        int [] ans = new int[V];
        int i =0;
        while(!st.isEmpty()){
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }
}
