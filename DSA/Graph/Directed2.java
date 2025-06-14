package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//cycle detetion on directed graph using bfs

public class Directed2 {
    public boolean iscyclic (int V, ArrayList<ArrayList<Integer>>adj){
        int []indegree = new int[V];
        for(int i =0;i<V;i++){
           for(int it:adj.get(i)){
            indegree[it]++;
           }
        }
        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            cnt++;

            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)q.add(it);
            }

        }if(cnt ==V ) return false;
        return true;
    }
}
