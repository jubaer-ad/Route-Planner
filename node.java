import java.util.ArrayList;

public class node {
	private double distanceFromSource = Integer.MAX_VALUE;
	ArrayList<Integer> nodeTrace= new ArrayList<Integer>();
	
	private boolean visited;
	private ArrayList<Edge> edges = new ArrayList<Edge>();
	public double getDistanceFromSource(){
		return distanceFromSource;
	}
	public void setDistanceFromSource(double distanceFromSource){
		this.distanceFromSource = distanceFromSource;
	}
	public boolean isVisited(){
		return visited;
	}
	public void setVisited(boolean visited){
		this.visited = visited;
	}
	public ArrayList<Edge> getEdges(){
		return edges;
	}
	public void setEdges(ArrayList<Edge> edges){
		this.edges = edges;
	}
	public void addToList(int c){
		this.nodeTrace.add(c);
	}
	public void setList(ArrayList<Integer> st){
		this.nodeTrace = st;
	}
	public ArrayList<Integer> getList(){
		return nodeTrace;
	}
}

