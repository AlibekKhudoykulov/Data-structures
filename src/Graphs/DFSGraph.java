import java.util.*;

public class DFSGraph {
    public static List<Integer> dfsTraversal(Graph graph, int source) {
        List<Integer> result = new ArrayList<>();
        int numVertices = graph.vertices;
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<Integer>(numVertices);
        
        stack.push(source);
        visited[source] = true;
        while(!stack.isEmpty()){
            int currentVertex = stack.pop();
            result.add(currentVertex);
            DoublyLinkedList<Integer>.Node temp = graph.adjacencyList[currentVertex].getHeadNode();
            while(temp!=null){
                if(!visited[temp.data]){
                    stack.push(temp.data);
                    visited[temp.data] = true;
                }
                temp = temp.nextNode;
            }
        }

        return result;
    }
}