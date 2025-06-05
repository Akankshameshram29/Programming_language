package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class Pair {
    int distance;
    int node;

    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }

    
}

public class Dijakstra{
    public int[] ShortestPath(int V, ArrayList<ArrayList<Pair>>adj, int Source){
        PriorityQueue <Pair> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.distance));
        int [] dist = new int[V];
        for(int i=0;i<V;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[Source]=0;
        pq.add(new Pair(0,Source));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int distance = current.distance;

            for (Pair edge : adj.get(node)) {
                int adjNode = edge.node;
                int edgeWeight = edge.distance;

                if (distance + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = distance + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }

}
