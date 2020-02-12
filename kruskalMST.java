import java.util.ArrayList;
import java.util.PriorityQueue;

public class kruskalMST {
	public ArrayList<Edge> mst(int noOfVertices, Edge[] edges){
		//Array List for save final mst edges
		ArrayList<Edge> list = new ArrayList<>();
		int parent[] = new int[noOfVertices];
		for (int i =0; i<noOfVertices; i++){
			parent[i] = i;
		}
		int noOfEdges = edges.length;
		Edge sortedEdge [] = new Edge[noOfEdges];
		//priority queue is for sorting the edges based on distance
		PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
		for(int i=0; i<noOfEdges; i++){
			priorityQueue.offer(edges[i]);
		}
		//putting sorted array in sortedEgde
		for(int i=0; i<noOfEdges; i++){
			sortedEdge[i] = priorityQueue.remove();
		}
//		System.out.println("Sorted edges are");
//		for(int i=0; i<noOfEdges; i++){
//			System.out.println(sortedEdge[i]);
//		}
		
		for(Edge e : sortedEdge){
			if (findRepresentative(e.getFromNodeIndex(), parent) != findRepresentative(e.getToNodeIndex(), parent)){
				list.add(e);
			}
			union(e.getFromNodeIndex(), e.getToNodeIndex(), parent);
		}
		return list;
		
	}
	public static int findRepresentative(int v, int parent[]){
		if (parent[v] == v)
			return v;
		parent[v] = findRepresentative(parent[v], parent);
		return parent[v];
	}
	public static void union(int a, int b, int parent[]){
		int u = findRepresentative(a, parent);
		int x = findRepresentative(b, parent);
		if (u != x)
			parent[u] = x;
	}
	
	
}
