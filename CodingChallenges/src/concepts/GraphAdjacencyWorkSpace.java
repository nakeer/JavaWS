package concepts;

import java.util.*;


class Graph {
	class Edge {
		public int u, w;
		public Edge (int u, int w) {
			this.u = u;
			this.w = w;
		}
		
		@Override
		public String toString() {
			return "("+u+","+w+")";
		}
		
	}
	
	List<Edge> ll[];
	public Graph(int n) {
		ll = new LinkedList[n];
		for(int i=0;i<n;i++) {
			ll[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v, int w) {
		ll[u].add(new Edge(v,w));
	}
	
	public boolean isConnected(int u, int v) {
		for(Edge e : ll[u]) {
			if(e.u == v) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i =0;i< ll.length;i++) {
			result = result + i + " -> " + ll[i] + "\n";	
		}
		return result;
	}
}


public class GraphAdjacencyWorkSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph(10);
		g.addEdge(0, 2, 10);
		g.addEdge(0, 5, 15);
		g.addEdge(2, 5, 10);
		g.addEdge(9, 3, 16);
		
		System.out.println(g);
		System.out.println(g.isConnected(2,5 ));
	}

}
