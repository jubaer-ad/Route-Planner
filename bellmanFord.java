public class bellmanFord {
	
	public double[] bellmanFordWork(Graph1 g, int source){
		
		double[] distance;
		int noOfNodes = g.getNoOfNodes();
		distance = new double[noOfNodes];
		
		for (int i=0; i<noOfNodes;i++){
			distance[i] = Integer.MAX_VALUE;
		}
		distance[source] = 0;
		for (int i=0; i<(noOfNodes-1); i++){
		for (Edge e : g.getEdges()){
			if (distance[e.getFromNodeIndex()] + e.getLength() < distance[e.getToNodeIndex()])
				distance[e.getToNodeIndex()] = distance[e.getFromNodeIndex()] + e.getLength();
		}
		}
		String message;
		for (Edge e : g.getEdges()){
			if (distance[e.getFromNodeIndex()] + e.getLength() < distance[e.getToNodeIndex()]) {
				message = "Negative cycle detected";
				System.out.println(message);
			}
		}
		return distance;
	}
}
