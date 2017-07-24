package cci.graphs;
import java.util.*;


class Vertex {
	char label;
	public boolean isVisited;
	
	public Vertex(char label) {
		this.label = label;
	}
}

class Graph {
	Map<Character, Integer> map;
	List<Vertex>[] list;
	int nVerts;
	
	public Graph(int maxVertices) {
		list = new LinkedList[maxVertices];
		map = new HashMap<>();
		for(int i = 0; i < maxVertices; i++) {
			list[i] = new LinkedList<>();
		}
	}
	
	public void addVertex(char label) {
		map.put(label, nVerts++);
	}
	
	public void addEdge(char u , char v) {
		int index = -1;
		if(map.containsKey(u)) {
			index = map.get(u);
		}
		else {
			index = nVerts;
			addVertex(u);
		}
		list[index].add(new Vertex(v));
		
		
	}
	
	public void displayVertex(Vertex v) {
		
	}
}

public class GraphAdjacencyListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
