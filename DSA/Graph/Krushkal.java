package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Edge implements Comparable<Edge> {
    int src;
    int dest;
    int wt;

Edge(int _src, int _dest, int _wt) {
    this.src = _src;
    this.dest = _dest;
    this.wt = _wt;
}
public int compareTo(Edge  compareEdge) {
    return this.wt - compareEdge.wt;
}
}
public class Krushkal {
    static int SpanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        List<Edge> edges = new ArrayList<Edge>();
        for(int i=0;i<V;i++){
            for(int j =0;j<adj.get(i).size();j++){
                int adjNode = adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                Edge temp = new Edge(i,adjNode,wt);
                edges.add(temp);
            }
           
        }
        Disjoint ds = new Disjoint(V);
        Collections.sort(edges);
        int mstwt = 0;
        for(int i=0;i<edges.size();i++){
            int wt = edges.get(i).wt;
            int u = edges.get(i).src;
            int v = edges.get(i).dest;

            if(ds.findParent(u) != ds.findParent(v)){
                mstwt += wt;
                ds.unionByRank(u,v);
            }
        }
        return mstwt;
    }
}

