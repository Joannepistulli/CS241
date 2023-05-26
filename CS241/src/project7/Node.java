package project7;
import java.util.ArrayList;
public class Node implements Comparable<Node> {
	String name;
	ArrayList<Edge> Neighbor;
	
	int weight;
	
	int distance;
	int time;
	int money;
	
	Node previous;
	
	public Node(String name) {
		this.name = name;
		this.Neighbor = new ArrayList<Edge>();
		this.weight = Integer.MAX_VALUE; 
		this.previous = null;

	}
	
	public void addNeighbor(int distance, int time, int money, int weight, Node n) {
		Neighbor.add(new Edge(distance, time, money, weight, n));
		n.Neighbor.add(new Edge(distance, time, money, weight, this));
	}
	

	public int compareTo(Node other) {
        return Integer.compare(weight, other.weight);
	}
	}