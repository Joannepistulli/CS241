package project2;

public class DoublyLinkedList {
	
		Node next;
		Node prev;
		Node head;
		Node tail;
	
	   public DoublyLinkedList() {
	       head = null;
	   }
	   
	   //insert (50%)
	   public void insert(String name) {
		    Node current = head;
		    Node last = null;
		    Node n = new Node(name);
		    
		    if (head == null){
		        head = n;
		        tail = n;
		    } 
		    else {
		    	while (current != null){
		            if (current.name.compareTo(n.name) > 0){
		                Node swap = current.prev;
		                current.prev = n;
		                n.next = current;
		                n.prev = swap;
		                if(swap != null) {
		                    swap.next = n;
		                } else {
		                    head = n;
		                }
		                break;
		            }
		            last = current;
		            current = current.next;
		        }
		        if (current == null) {
		            last.next = n;
		            n.prev = last;
		            tail = n;
		        }
		    }
		   }
	   
	   //remove (30%)
	   public void remove(String name) {
		    Node current = head;
		    Node n = new Node(name);
		        
		        if(find(name) == null) {
		            return; 
		        }
		        
		        if(n == tail) {
		            n.prev = tail;
		            tail.next = null;
		        }
		        else if(n == head) {
		            head = n.next;
		            head.prev = null;
		        }
		        else {
		            n.next.prev = n.prev;
		            n.prev.next = n.next;
		        } 
		    }
	   
	   //find (5%) - DOES NOT WORK - ONLY GOES THROUGH THE FIRST - NOT THE NEXT
	   public Node find(String search) {
	           Node current = head;
  while (current != null) {
      if (current.next.equals(search)) {
        return current.next;
      } 
      else if (!current.next.equals(search)){
          return null;
        }
    }
  return null;
}
	      
	   //print and printReverse (5%)
	   public void print () {
		   if (head == null) return;
		   
		   Node current = head;
		   
		   while (current != null ) {
			   System.out.println(current.name);
			   current = current.next;
		   }
	   }

	   //printReverse(Node n) is taken from class lecture
		   public void printReverse(Node n) {
			   if (n == null) return;
			   printReverse(n.next);
			   System.out.println(n.name);
			 }

			 public void printReverse() {
			   printReverse(head);
			 }

	//getFirst and getLast (5%)
	   public Node getFirst() {
		   Node current = head;
	        return current;
	   }
	   public Node getLast() {
		   Node current = tail;
	        return current;
	   }
	   }
	   


