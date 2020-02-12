import java.util.*;

class graphModel{
	class node{
		int v,w;
		public node(int v, int w){
			this.v=v;
			this.w=w;
		}
		@Override
		public String toString(){
			return "("+v+","+w+")";
		}
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<arrayOfLinkedList.length;i++){
			result+=i+"=>"+arrayOfLinkedList[i]+"\n";
		}
		return result;
	}
	LinkedList<node> arrayOfLinkedList[];
	public graphModel(int n){
		arrayOfLinkedList = new LinkedList[n];
		for(int i=0;i<arrayOfLinkedList.length;i++){
			arrayOfLinkedList[i] = new LinkedList<>();
		}
	}
	public void addNode(int pos, int v, int w){
		arrayOfLinkedList[pos].add(0,new node(v,w));
	}
	boolean isConnected(int a, int b){
		for(node i:arrayOfLinkedList[a])
			if(i.v == b) return true;
		return false;
	}
	
}


public class graphUsingAdjacencyList {
	public static void main(String arg[]){
		graphModel newGraph = new graphModel(6);
		newGraph.addNode(0,2,16);
		newGraph.addNode(1,5,20);
		newGraph.addNode(5,1,46);
		newGraph.addNode(0,2,80);
		System.out.println(newGraph);
		System.out.println(newGraph.isConnected(0,2));
		System.out.println(newGraph.isConnected(1,2));
		System.out.println();
	}

}