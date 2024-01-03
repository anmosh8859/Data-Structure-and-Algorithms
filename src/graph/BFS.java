package graph;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
    BFS(int startVertex) {
        Graph g = new Graph(startVertex);
        boolean[] visited = new boolean[g.V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : g.adjList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
