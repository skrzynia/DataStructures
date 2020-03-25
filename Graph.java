import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	int vertex;
	List<Integer> adj[];
	
	public Graph(int v) {
		
		vertex = v;
		adj = new LinkedList[vertex];
		
		for(int i = 0; i < vertex; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	
	public void addEdge(int source, int destination) {
		
		adj[source].add(destination);
		adj[destination].add(source);
		
	}

	public void printGraph() {
		
		for(int i = 0; i<adj[i].size(); i++) {
			
			
			System.out.println("Vertex: " + i);
			Iterator<Integer> iterator = adj[i].iterator();
			
			
			
			while(iterator.hasNext()) {
			System.out.println(" --> " + iterator.next());	
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		
		graph.printGraph();
	}
	
}


