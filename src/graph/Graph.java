package graph;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
    protected int V;
    protected LinkedList<Integer>[] adjList;

    Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }
    void BFS(int startVertex) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            for (int neighbor : adjList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
//    void DFS(int startVertex) {
//        boolean[] visited = new boolean[V];
//        DFSUtil(startVertex, visited);
//    }
//
//    private void DFSUtil(int currentVertex, boolean[] visited) {
//        visited[currentVertex] = true;
//        System.out.print(currentVertex + " ");
//        for (int neighbor : adjList[currentVertex]) {
//            if (!visited[neighbor]) {
//                DFSUtil(neighbor, visited);
//            }
//        }
//    }
}
