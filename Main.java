import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		Edge[] edges = {
				new Edge(0,1,21.3),
				new Edge(0,2,4),
				new Edge(0,9,10.7),
				new Edge(1,0,21.3),
				new Edge(1,5,12.3),
				new Edge(1,3,10.9),
				new Edge(2,0,4),
				new Edge(2,3,7.7),
				new Edge(2,5,3.7),
				new Edge(2,4,1.4),
				new Edge(2,7,5.9),
				new Edge(3,1,10.9),
				new Edge(3,6,3.2),
				new Edge(3,5,5.6),
				new Edge(3,2,7.7),
				new Edge(4,2,1.4),
				new Edge(4,5,3.9),
				new Edge(4,7,6.8),
				new Edge(5,2,3.7),
				new Edge(5,3,5.6),
				new Edge(5,1,12.3),
				new Edge(5,6,3.9),
				new Edge(5,8,8.9),
				new Edge(5,10,7.5),
				new Edge(5,7,2.4),
				new Edge(5,4,3.9),
				new Edge(6,3,3.2),
				new Edge(6,5,3.9),
				new Edge(6,7,2.8),
				new Edge(6,8,4.6),
				new Edge(7,4,6.8),
				new Edge(7,5,2.4),
				new Edge(7,6,2.8),
				new Edge(7,8,5),
				new Edge(7,9,4.2),
				new Edge(7,2,5.9),
				new Edge(8,6,4.6),
				new Edge(8,5,8.9),
				new Edge(8,7,5),
				new Edge(8,10,3.6),
				new Edge(9,0,10.7),
				new Edge(9,7,4.2),
				new Edge(9,10,3.3),
				new Edge(10,8,3.6),
				new Edge(10,5,7.5),
				new Edge(10,9,3.3)
		
		};
		System.out.println("Places in Dhaka city: ");
		System.out.println("0. Aminbazar    1. Airport      2. Shymoli      3. Rampura\n4. Mohammadpur      5. Farmgate     6. Malibagh     7. Shahbag" +
				"\n8. Sayedabad     9. Kamrangir Char       10. Sadarghat");
		Graph1 g = new Graph1(edges);
		System.out.println(".............Options of Algorithm.............\n............Choose One..........");
		System.out.println("1. Dijkstra Algorithm\n2. MST\n3. Bellman  Ford Algorithm");
		System.out.print("Enter :");
		int i = scan.nextInt();
		switch (i){
			case 1:
				System.out.println("You are in Dijkstra section:");
				System.out.println("Enter starting point by index: ");
				int startIndex = scan.nextInt();
				System.out.println("Enter end point by index: ");
				g.calculateShortestDistances(startIndex);
				int endIndex = scan.nextInt();
				g.printResult(startIndex, endIndex);
				main(arg);
				
			case 2:
				System.out.println("You are in MST section:");
				int noOfNodes = g.calculateNoOfNodes(edges);
				kruskalMST mst = new kruskalMST();
				ArrayList<Edge> mstList;
				mstList = mst.mst(noOfNodes, edges);
				double mstDistance = 0;
				System.out.println("Total distance of MST: ");
				for (Edge e : mstList){
					mstDistance+=e.getLength();
				}
				System.out.println(+mstDistance);
				System.out.println("List of edges used in MST: ");
				System.out.println(mstList);
				main(arg);
				
			case 3:
				System.out.println("You are in Bellman Ford section:");
				int source;
				System.out.println("Enter the source for Bellman Ford: ");
				source = scan.nextInt();
				bellmanFord bellmanFordObj = new bellmanFord();
				double[] distances = bellmanFordObj.bellmanFordWork(g, source);
				bellmanFordResultPrint result = new bellmanFordResultPrint();
				result.resultPrint(distances, source);
				main(arg);
			
			default:
				System.out.println("Error input. Try Again.");
				main(arg);
		}
		
		
		
	
	}
}
