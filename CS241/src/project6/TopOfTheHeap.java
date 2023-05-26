
/*
  Your Name: JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU
  
Based on your implementation, what is the big O for the following methods: 

  insert():
  The big O would be log(n). 
  
  delete(): 
  The big O would be log(n).
  
  isEmpty():
  The big O would be O(1).
  
  Based on your implementation, what is the big O for combine() and why?:
  The big O would be O(n*log n) because elements are ordered in the same 
  order in the sorted list.
  
  Based on your implementation, what is the big O for purge() and why?:
  The big O would be O(1) because the behavior of the time remains 
  unaffected by the calling of this method.
*/
package project6;

public class TopOfTheHeap {
	public static void main(String[] args) {
		// These are just some examples, be sure to test everything! 
		PizzaQueue pq = new PizzaQueue(4);
		pq.insert(new Pizza(10, "Pepperoni Pizza"));
		pq.insert(new Pizza(5, "Mushroom Pizza"));
		pq.insert(new Pizza(100, "Super Duper Pizza")); 
		pq.insert(new Pizza(25, "Chicken Pizza")); 
		pq.debug();
		
		System.out.println(pq.delete()); 
		System.out.println();
		
		pq.debug();
		
		PizzaQueue paceEvent = new PizzaQueue(3); 
		paceEvent.insert(new Pizza(1, "Plain Pizza")); 
		paceEvent.insert(new Pizza(12, "Sausage Pizza")); 
		paceEvent.insert(new Pizza(3, "Salad Pizza")); 
		paceEvent.debug();
		
		pq.combine(paceEvent);
		
		Pizza[] finalList = pq.purge();
		
		for (Pizza p : finalList) { 
			if(p==null){
			//NOTHING. JUST A PLACE HOLDER.
			}
			else{
				System.out.println(p);
			}
		} 
	}
}
