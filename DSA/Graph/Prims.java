package Graph;

import java.util.PriorityQueue;
import java.util.ArrayList;


class Pair{
  int distance;
  int node;
  Pair(int distance,int node){
    this.distance = distance;
    this.node = node;
  }
}

//minimum spanning tree using prims Algorithm


public class Prims {
public int SpanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj){
  PriorityQueue<Pair>pq = new PriorityQueue<Pair>((X,Y)-> X.distance - Y.distance);
  int [] vis = new int[V];
  pq.add(new Pair(0,0));
  int sum = 0;
  while (pq.size()>0) {
    int wt = pq.peek().distance;
    int node = pq.peek().node;
    pq.remove();

    if(vis[node]==1) continue;
    vis[node] = 1;
    sum += wt;  
    for(int i=0;i<adj.get(node).size();i++){

    int edw = adj.get(node).get(i).get(1);
    int adjnode = adj.get(node).get(i).get(0);
    if(vis[adjnode]==0){
        pq.add(new Pair(edw, adjnode));
    }
   }
  }
  return sum;
 }
}