/*
  Your Name: JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU
  
  Given your implementation, what is the runtime of:
  Find and why?
  O(log n) because not only are we using recursion, we're also using the time
  complexity of binary trees...
  
  Count and why?
  O(n^2) because of the recursive loops but unfortunately my code is broke so it
  might be even slower :/
*/

package Exam2;

public class Main {
	public static void main(String[] args) {
		
		StudentTree st = new StudentTree(); 
		
		st.insert("Carmine Guida");
		
		st.insert("Judd Nelson"); 
		st.insert("Emilio Estevez"); 
		st.insert("Ally Sheedy"); 
		st.insert("Molly Ringwald"); 
		st.insert("Anthony Michael Hall");
		
		Student s1 = st.find("Ally Sheedy"); 
		Student s2 = st.find("Harry Potter");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("\nCount: " + st.count());
		
		System.out.println("\nPrint in order:"); 
		st.print();
		
		System.out.println("\nPrint in pre-order:");
		st.printPreOrder(); 
		
		}
}
