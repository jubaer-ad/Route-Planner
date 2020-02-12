import java.util.*;

public class graphgraph {
	static class node{
		String name;
		double distance;
		public node(String name, double distance){
			this.name = name;
			this.distance = distance;
		}
		public String toString(){
			return "("+name+", "+distance+")";
		}
	}
	
	public static HashMap<String,ArrayList<node>> graph = new HashMap<>();
	public static void addNode(String place, String name, double distance ){
		ArrayList<node> newNode = new ArrayList<>();
		node n1 = new node(name,distance);
		newNode.add(0,n1);
		graph.put(place,newNode);
	}
	public static void editList(String place, String name, double distance){
		node n1 = new node(name, distance);
		(graph.get(place)).add(n1);
	}
	public static void showGraph(){
//		for (Map.Entry<String, ArrayList<node>> e : graph.entrySet()) {
//			//to get key
//			System.out.println(e.getKey()+"=>"+e.getValue());
//			//and to get value
//
//		}
		Set<String> keys = graph.keySet();
		for(String i : keys){
			System.out.println(i+"=>"+graph.get(i));
			//System.out.println("\n");
		}
		
	}
	
	public static void dataEntry(){
//		addNode("Kalaia",2, "Bauphal");
//		//showGraph();
//		addNode("Kalaia",5, "Boga");
//		//showGraph();
//		editList("Boga","Bauphal",3);
//		editList("Bauphal","Boga",3);
//		addNode("Bauphal",2, "Kalaia");
		addNode("Aminbazar","Airport",21.3);
		editList("Aminbazar","Kamrangir Char",10.7);
		editList("Aminbazar","Shymoli",4);
		
		addNode("Airport","Aminbazar",21.3);
		editList("Airport","Farmgate",12.3);
		editList("Airport","Rampura",10.9);
		
		addNode("Kamrangir Char","Aminbazar",10.7);
		editList("Kamrangir Char","Shahbag",4.2);
		editList("Kamrangir Char","Sadarghat",3.3);
		
		addNode("Sadarghat","Kamrangir Char",3.3);
		editList("Sadarghat","Farmgate",7.5);
		editList("Sadarghat","Sayedabad",3.6);
		
		addNode("Sayedabad","Shahbag",5);
		editList("Sayedabad","Farmgate",8.9);
		editList("Sayedabad","Malibagh",4.6);
		
		addNode("Shahbag","Sayedabad",5);
		editList("Shahbag","Mohammadpur",6.8);
		editList("Shahbag","Shyamoli",5.9);
		editList("Shahbag","Kamrangir Char",4.2);
		editList("Shahbag","Farmgate",2.4);
		editList("Shahbag","Malibagh",2.8);
		
		addNode("Mohammadpur","Shahbag",6.8);
		editList("Mohammadpur","Shyamoli",1.4);
		editList("Mohammadpur","Farmgate",3.9);
		
		addNode("Shyamoli","Aminbazar",4);
		editList("Shyamoli","Shahbag",5.9);
		editList("Shyamoli","Mohammadpur",1.4);
		editList("Shyamoli","Farmgate",3.7);
		editList("Shyamoli","Rampura",7.7);
		
		addNode("Rampura","Shyamoli",7.7);
		editList("Rampura","Farmgate",5.6);
		editList("Rampura","Malibagh",3.2);
		editList("Rampura","Airport",10.9);
		
		addNode("Malibagh","Rampura",3.2);
		editList("Malibagh","Farmgate",3.9);
		editList("Malibagh","Shahbag",2.4);
		editList("Malibagh","Sayedabad",4.6);
		
		addNode("Farmgate","Rampura",5.6);
		editList("Farmgate","Airport",12.3);
		editList("Farmgate","Shahbag",2.4);
		editList("Farmgate","Sayedabad",8.9);
		editList("Farmgate","Mohammadpur",3.9);
		editList("Farmgate","Shyamoli",3.7);
		editList("Farmgate","Kamrangir Char",4.2);
		editList("Farmgate","Sadarghat",7.5);
		editList("Farmgate","Malibagh",3.9);
		
		
	}
	
	public static void dijkstra(){
		ArrayList<String> allPlaces = new ArrayList<>();
		allPlaces.add("Aminbazar");
		allPlaces.add("Rampura");
		allPlaces.add("Shahbag");
		allPlaces.add("Airport");
		allPlaces.add("Farmgate");
		allPlaces.add("Malibagh");
		allPlaces.add("Kamrangir Char");
		allPlaces.add("Sadarghat");
		allPlaces.add("Shyamoli");
		allPlaces.add("Sayedabad");
		allPlaces.add("Mohammadpur");
		
		HashMap<String, Double> Aminbazar = new HashMap<>();
		graph.get("Aminbazar");
		
		
	}
	public static void main(String arg[]){
		dataEntry();
		showGraph();
	}
}
