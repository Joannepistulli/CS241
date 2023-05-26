package project6;

public class PizzaQueue {
	Pizza[] list;
	int count = 0;
	
	 public PizzaQueue(int capacity) {
	        list = new Pizza[capacity + 5];
	    }
	 
	 //Credit: CS241 Class Lecture
	public void insert(Pizza p) {
		count ++;
		int hole = count;
		
		if(count == list.length){
            Pizza[] temp = new Pizza[list.length + 10]; // Make the list longer
            for(int i=1; i < list.length; i++){ 
                 temp[i] = list[i];
             }
            list = temp; // Point our old list to the new one
     }
		while (true) {
			if (hole == 1) break;
			int parent = hole / 2;
			
			if (p.priority < list[parent].priority) break;
			
			list[hole] = list[parent];
			hole = parent;
		}
		list[hole] = p;
	}
	
	//Credit: CS241 Class Lecture
	public Pizza delete() {
        if (isEmpty()) return null;
        Pizza result = list[1];
        Pizza temp = list[count];
        count--;
        
         int hole = 1;
            while (true) {
                int child = hole * 2;
                if (child > count) break;
                if (child == count){}else{
                if (child != count) {
                    if(list[child + 1].priority > list[child].priority){
                        child = child + 1;
                    }
                }
                }
                if (temp.priority > list[child].priority){
                    break;
                }else{
                    list[hole] = list[child];
                }
                hole = child;
            }
            list[hole] = temp;
        return result;
    }
	
	//Credit: CS241 Class Lecture
	public boolean isEmpty() {
		if (count == 0) return true;
		return false;
	}
	
	public void debug() {
		for (int i = 1; i <= count; i++)
			System.out.println(list[i]);
	}
	
	public void combine(PizzaQueue pq) {
		while(!pq.isEmpty()) {
		      insert(pq.delete());
	}
	}
	
	public Pizza[] purge() {
		return list;
	}

}
