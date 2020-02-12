import java.util.ArrayList;
import java.util.Stack;

public class Graph1 {
	private node[] nodes;
	private int noOfNodes;
	private Edge[] edges;
	private int noOfEdges;
	
	public Graph1(Edge[] edges){
		this.edges = edges;
		this.noOfNodes = calculateNoOfNodes(edges);
		this.nodes = new node[this.noOfNodes];
		for(int n=0; n<this.noOfNodes;n++){
			this.nodes[n] = new node();
		}
		this.noOfEdges = edges.length;
		for(int edgeToAdd=0; edgeToAdd<this.noOfEdges;edgeToAdd++){
			this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
		}
	}
	public int calculateNoOfNodes(Edge[] edges){
		int noOfNodes = 0;
		for(Edge e : edges){
			if (e.getToNodeIndex() > noOfNodes)
				noOfNodes = e.getToNodeIndex();
			if(e.getFromNodeIndex() > noOfNodes)
				noOfNodes = e.getFromNodeIndex();
		}
		noOfNodes++;
		return noOfNodes;
	}
	
	public void calculateShortestDistances(int c){
		this.nodes[c].setDistanceFromSource(0);
		this.nodes[c].nodeTrace.add(c);
		int nextNode = c;
		for (int i=0; i<this.nodes.length; i++){
			ArrayList<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();
			for (int joinedEdge =0; joinedEdge<currentNodeEdges.size();joinedEdge++){
				int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);
				if(!this.nodes[neighbourIndex].isVisited()){
					double tentative = this.nodes[nextNode].getDistanceFromSource() + currentNodeEdges.get(joinedEdge).getLength();
					if(tentative < nodes[neighbourIndex].getDistanceFromSource()){
						nodes[neighbourIndex].setDistanceFromSource(tentative);
						nodes[neighbourIndex].setList(nodes[nextNode].getList());
						nodes[neighbourIndex].nodeTrace.add(neighbourIndex);
					}
					
				}
			}
			nodes[nextNode].setVisited(true);
			nextNode = getNodeShortestDistanced();
		}
	}
	private int getNodeShortestDistanced(){
		int storedNodeIndex = 0;
		double storedDist = Integer.MAX_VALUE;
		for(int i=0; i<this.nodes.length; i++){
			double currentDist = this.nodes[i].getDistanceFromSource();
			if(!this.nodes[i].isVisited() && currentDist<storedDist){
				storedDist =currentDist;
				storedNodeIndex = i;
			}
		}
		return storedNodeIndex;
		
	}
	public void printResult(int c, int c2){
		String startPlace = null,endPlace = null;
		if (c == 0)
			startPlace = "Aminbazar";
		else if (c == 1)
			startPlace = "Airport";
		else if (c == 2)
			startPlace = "Shyamoli";
		else if (c == 3)
			startPlace = "Rampura";
		else if (c == 4)
			startPlace = "Mohammadpur";
		else if (c == 5)
			startPlace = "Farmgate";
		else if (c == 6)
			startPlace = "Malibagh";
		else if (c == 7)
			startPlace = "Shahbagh";
		else if (c == 8)
			startPlace = "Sayedabad";
		else if (c == 9)
			startPlace = "Kamrangir Char";
		else if(c == 10)
			startPlace = "Sadarghat";
		 // ="Number of nodes = "+this.noOfNodes;
//		output += "\nNumberof edges = "+this.noOfEdges;
		int i=c2;
			if (i == 0)
				endPlace = "Aminbazar";
			else if (i == 1)
				endPlace = "Airport";
			else if (i == 2)
				endPlace = "Shyamoli";
			else if (i == 3)
				endPlace = "Rampura";
			else if (i == 4)
				endPlace = "Mohammadpur";
			else if (i == 5)
				endPlace = "Farmgate";
			else if (i == 6)
				endPlace = "Malibagh";
			else if (i == 7)
				endPlace = "Shahbagh";
			else if (i == 8)
				endPlace = "Sayedabad";
			else if (i == 9)
				endPlace = "Kamrangir Char";
			else if (i == 10)
				endPlace = "Sadarghat";
		String output = ("\nThe shortest distance from "+startPlace+" to " + endPlace + " is " + nodes[i].getDistanceFromSource());
		System.out.println("Paths :");
		//System.out.println(nodes[i].nodeTrace.toString());
		System.out.println(output);
	}
	
	
	public node[] getNodes(){
		return nodes;
	}
	public int getNoOfNodes(){
		return noOfNodes;
	}
	public Edge[] getEdges(){
		return edges;
	}
	public int getNoOfEdges(){
		return noOfEdges;
	}
	
	
	
}
