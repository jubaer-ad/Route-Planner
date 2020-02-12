
import java.util.*;
class Graph{
	class Edge{
		int v,w;
		public Edge(int v,int w){
			this.v=v; this.w=w;
		}
		@Override
		public String toString(){
			return "("+v+","+w+")";
		}
	}
	LinkedList<Edge> G[];
	public Graph(int n){
		G = new LinkedList[n];
		for(int i=0;i<G.length;i++){
			G[i] = new LinkedList<>();
		}
	}
	void addEdge(int u,int v,int w){
		G[u].add(0,new Edge(v,w));
	}
	boolean isConnected(int u, int v){
		for(Edge i:G[u])
			if(i.v==v) return true;
		return false;
	}
	@Override
	public String toString(){
		String result = "";
		for(int i=0;i<G.length;i++){
			result+=i+"=>"+G[i]+"\n";
		}
		return result;
	}
}
public class graphUsingAdjacencyList1 {
	public static void main(String arg[]){
		Graph g = new Graph(10);
		g.addEdge(0,2,10);
		g.addEdge(0,5,15);
		g.addEdge(2,5,10);
		g.addEdge(9,3,16);
		
		System.out.print(g);
		System.out.println(g.isConnected(0,2));
		System.out.println(g.isConnected(0,5));
		System.out.println(g.isConnected(0,10));
	}

}
