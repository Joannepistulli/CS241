/*
  Your Name: JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU
*/
package project7;

import java.util.PriorityQueue;

public class ThePacePath {
	public static void main(String[] args) {
		
		Node a = new Node("Museum of Natural History");
		Node b = new Node("Times Square");
		Node c = new Node("Penn Station");
		Node d = new Node("Empire State Building");
		Node e = new Node("Flatiron Building");
		Node f = new Node("163 William Street");
		Node g = new Node("The Met");
		Node h = new Node("Grand Central Station");
		Node i = new Node("Chrysler Building");
		Node j = new Node("1 Pace Plaza");
		Node k = new Node("Brooklyn Bridge");
		
		a.addNeighbor(8, 20, 8, 36, b);
		
		b.addNeighbor(8, 20, 8, 36, a);
		b.addNeighbor(1, 4, 2, 7, c);
		b.addNeighbor(1, 4, 2, 7, d);
		b.addNeighbor(2, 2, 2, 6, h);
		
		c.addNeighbor(1, 4, 2, 7, b);
		c.addNeighbor(1, 3, 1, 5, d);
		
		d.addNeighbor(1, 4, 2, 7, b);
		d.addNeighbor(1, 3, 1, 5, c);
		d.addNeighbor(2, 3, 2, 7, e);
		
		e.addNeighbor(2, 3, 2, 7, d);
		e.addNeighbor(3, 5, 3, 11, f);
		
		f.addNeighbor(3, 5, 3, 11, e);
		f.addNeighbor(1, 1, 1, 3, j);
		f.addNeighbor(1, 2, 1, 4, k);
		
		g.addNeighbor(10, 30, 10, 50, h);
		
		h.addNeighbor(10, 30, 10, 50, g);
		h.addNeighbor(2, 2, 2, 6, b);
		h.addNeighbor(1, 1, 1, 3, i);
		h.addNeighbor(7, 5, 2, 14, j);
		
		i.addNeighbor(1, 1, 1, 3, h);
		
		j.addNeighbor(7, 5, 2, 14, h);
		j.addNeighbor(1, 1, 1, 3, f);
		j.addNeighbor(1, 1, 1, 3, k);
		
		k.addNeighbor(1, 1, 1, 3, j);
		k.addNeighbor(1, 2, 1, 4, f);
		
		//CHANGE FOLLOWING LINE TO TEST:
		Path(a,k,2);
	}

	public static void Path(Node start, Node end, int pathType) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		
		if (pathType == 0) {
		start.weight = 0;
		pq.add(start);
		
		while(!pq.isEmpty()) {
			Node current = pq.poll();
			
			if(current == end) break;
			
			for (Edge e: current.Neighbor) {
				int newWeight = current.weight + e.weight;
		        Node n = e.n;
		        
		    if(newWeight > n.weight) continue;
		    n.weight = newWeight;
		    n.previous = current;
		    pq.remove(n);
		    pq.add(n);
		    
			}
		}
		}
		
		if (pathType == 1) {
			start.weight = 0;
			pq.add(start);
			
			while(!pq.isEmpty()) {
				Node current = pq.poll();
				
				if(current == end) break;
				
				for (Edge e: current.Neighbor) {
					int newWeight = current.weight + e.weight;
			        Node n = e.n;
			        
			    if(newWeight > n.weight) continue;
			    n.weight = newWeight;
			    n.previous = current;
			    pq.remove(n);
			    pq.add(n);
			    
				}
			}
			}
		
		if (pathType == 2) {
			start.weight = 0;
			pq.add(start);
			
			while(!pq.isEmpty()) {
				Node current = pq.poll();
				
				if(current == end) break;
				
				for (Edge e: current.Neighbor) {
					int newWeight = current.weight + e.weight;
			        Node n = e.n;
			        
			    if(newWeight > n.weight) continue;
			    n.weight = newWeight;
			    n.previous = current;
			    pq.remove(n);
			    pq.add(n);
			    
				}
			}
			}
		printPath(end);
	}
	
	public static void printPath(Node n) {
		if (n == null) return;
		
		printPath(n.previous);
		System.out.println(n.name);
		
	}
}
