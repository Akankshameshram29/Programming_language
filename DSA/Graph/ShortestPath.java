package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//shortest path in DAG
public class ShortestPath{
  private void toposort(int node,ArrayList<ArrayList<Pair>>adj,int []visited, Stack<Integer>st){
    visited[node] = 1;
    for(int i =0;i<adj.get(node).size();i++){
      int V = adj.get(node).get(i).first;
      if(visited[V]==0){
        toposort(V, adj, visited, st);
      }
    }
    st.push(node);
  }
  public int[] shortestPath(int N, int M,int[][]edges){
    ArrayList<ArrayList<Pair>>adj = new ArrayList<>();
    for(int i=0;i<N;i++){
        ArrayList<Pair> temp = new ArrayList<Pair>();
        adj.add(temp);
    }
    for(int i =0;i<M;i++){
        int u = edges[i][0];
        int v = edges[i][1];
        int wt = edges[i][2];
        adj.get(u).add(new Pair(v,wt));
    }
    int [] visited = new int[N];
    Stack<Integer>st = new Stack<>();
    for(int i=0;i<N;i++){
      if(visited[i]==0){
        toposort(i, adj, visited, st);
      }
    }
    int [] dist = new int[N];
    for(int i =0;i<N;i++){
      dist[i] = Integer.MAX_VALUE;
    }
    dist[0]=0;
    while (!st.isEmpty()) {
      int node = st.peek();
      st.pop();
      for(int i =0;i<adj.get(node).size();i++){
        int v = adj.get(node).get(i).first;
        int wt = adj.get(node).get(i).second;

         if(dist[node]+wt<dist[v]){
          dist[v] = wt+dist[node];
         }
      }
    }
    for (int i = 0; i < N; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }
    return dist;
  }
  public static void main(String[] args) {
        ShortestPath sp = new ShortestPath();

        int N = 6; // Number of nodes
        int M = 7; // Number of edges
        int[][] edges = {
            {0, 1, 2},
            {0, 4, 1},
            {1, 2, 3},
            {4, 2, 2},
            {4, 5, 4},
            {2, 3, 6},
            {5, 3, 1}
        };

        int[] result = sp.shortestPath(N, M, edges);
        System.out.println(Arrays.toString(result));
    }
}