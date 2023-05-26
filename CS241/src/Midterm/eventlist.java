package Midterm;

public class eventlist {
	 event head;
	 event tail;
	 public eventlist() {
	    head = null;
	    tail = null;
	}
	 
	//addToFront 
	public void addToFront(String name, int minutes) { 
	event m = new event(name, minutes);
	m.next = head;
	head = m;
    m = head;
    if (head != null)
    head.prev = m;
    head = m;
	}
	
	//addToEnd
	public void addToEnd(String name, int minutes) {
		event m = new event(name, minutes);
        //if list is empty, this will be the only node in it
        if (tail == null)
            tail = m;
       
        else
        {
            event temp = tail;
            while (temp.next != null)
            temp = temp.next;
            //link new node into list
            temp.next = m;
            m.prev=temp;
        }
    }
	
	//print method
    public void print () {
        if (head == null) return;
        
        event current = head;
        
        while (current != null ) {
            System.out.println(current.name);
            current = current.next;
            
            if (tail == null) return;
            
            event previous = tail;
            
            while (previous != null ) {
                System.out.println(previous.name);
                previous = previous.next;
        }
	}
    }
    
    //count method
    public int count() {
    	event m = head;
    	  m = this.head;
    	  
    	  int i = 0;
    	  
    	  while(m != null) {
    	    i++;
    	    m = m.next;
    	  }
    	  
    	  m = this.tail;
    	  
    	  while(m != null) {
    	    i++;
    	    m = m.next;
    	  }
    	  
    	  System.out.println(i);
    	  return i; 
    }
    
    //sum method - DOES NOT WORK
    public int sum() { 
    	{
    	public int time(event m) {
            if (m == null) {
                return 0;
            } else {
                return m.minutes + helper(m.next);
            }
        }

        public int sum() {
            return time(head);
        }
    }
    
    }
}
