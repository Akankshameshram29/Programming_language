package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Shortest Path in an undirected Graph using BFS
public class ShortestPath2 {
   public int [] shortestPath(int N, int M,int source,int[][] edges){
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for(int i=0;i<N;i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0;i<M;i++){
        adj.get(edges[i][0]).add(edges[i][1]);
        adj.get(edges[i][1]).add(edges[i][0]);
    }
    int [] dist = new int[N];
    for(int i=0;i<N;i++){
        dist[i] = Integer.MAX_VALUE;
    }
    dist[source] = 0;
    Queue<Integer> q = new LinkedList<>();
    q.add(source);
    while(!q.isEmpty()){
        int node = q.poll();
        
        for(int it: adj.get(node)){
            if(dist[node] + 1 < dist[it]){
                dist[it] = dist[node] + 1;
                q.add(it);
            }
        }
    }
    for(int i=0;i<N;i++){
        if(dist[i] == Integer.MAX_VALUE){
            dist[i] = -1;
        }
    }
    return dist;
    
   }
}