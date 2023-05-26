package project7;

public class Edge {
	int weight;
	int distance;
	int time;
	int money;
	Node n;
	
	public Edge(int distance, int time, int money, int weight, Node n) {
		this.distance = distance;
		this.time = time;
		this.money = money;
		this.weight = weight;
		this.n = n;
	}
	
	public int compareTo(Edge other) {
		return Integer.compare(weight, other.weight);
	}
}
