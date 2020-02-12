public class Edge implements Comparable<Edge> {
	private int fromNodeIndex;
	private int toNodeIndex;
	private double length;
	public Edge(int fromNodeIndex, int toNodeIndex, double length){
		this.fromNodeIndex = fromNodeIndex;
		this.toNodeIndex = toNodeIndex;
		this.length = length;
	}
	public int getFromNodeIndex(){
		return fromNodeIndex;
	}
	
	public int getToNodeIndex() {
		return toNodeIndex;
	}
	
	public double getLength() {
		return length;
	}
	public int getNeighbourIndex(int nodeIndex){
		if (this.fromNodeIndex == nodeIndex)
			return toNodeIndex;
		else
			return this.fromNodeIndex;
	}
	//part for priority queue
	public boolean equals(Edge other){
		return this.getLength() == other.getLength();
	}
	public int compareTo(Edge other){
		if(this.equals(other))
			return 0;
		else if (getLength() > other.getLength())
			return 1;
		else
			return -1;
	}
	@Override
	public String toString(){
		return "("+fromNodeIndex+"=>"+toNodeIndex+") ";
	}
}
