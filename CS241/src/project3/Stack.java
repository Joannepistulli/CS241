package project3;

public class Stack {
	Node head;

	  public Stack(){
	    head = null;
	  }

	  public boolean isEmpty(){
	    if (head == null) return true;
	    return false;
	  }

	  public void push(String data) {
	    Node n = new Node(data);

	    n.next = head;
	    head = n;
	  }

	  public Node pop() {
	    Node n = head;
	    head = head.next;
	    
	    return n;
	  }
	}
