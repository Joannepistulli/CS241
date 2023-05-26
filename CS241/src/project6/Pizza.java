package project6;

public class Pizza implements Comparable<Pizza>{
	public int priority;
	
	public String flavor;
	
	public Pizza(int priority, String flavor) {
		this.priority = priority;
		this.flavor = flavor;
	}

	public String toString() {
		return "[" + priority + "]" + flavor;
	}
	
	public int compareTo(Pizza other) {
		if (this.priority > other.priority) return -1;
		return 1;
	}
}
