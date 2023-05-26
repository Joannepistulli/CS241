/*
  Your Name:  JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU
  
Write a few sentences about some of the special cases and considerations 
you had when working on the insert and remove methods:

In consideration of special cases: There would have to be multiple "If-else" statements
depending what they wanted to remove or insert. For example, there was three possibilities
where you could remove something. If you wanted to add something in-between, you had 4-5
possible spots in which you could add something. It was frustrating but it gave me the
perspective of a "user" to an extent.
*/
package project2;

public class DoubleTrouble {
	
	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList(); 

		list.insert("Cat");
		list.insert("Frog");
		list.insert("Dog");
		
		list.print();
		list.printReverse();
		
	}
}