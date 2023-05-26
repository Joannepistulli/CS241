package Exam2;

public class StudentTree {
	Student root;
	
public void insert(String name) {
	    Student s = new Student(name);
	    if (root == null) {
	      root = s;
	      return;
	}
	    
	    Student current = root;
	    while (true) {
	if (s.name.compareTo(current.name) < 0) { if (current.left == null) {
	current.left = s;
	          return;
	        } else {
	current = current.left; }
	}
	else {
	          // Add to the right side
	          // You need to remove/change/add code here
		if (s.name.compareTo(current.name) > 0) {
	        if (current.right == null) {
	          current.right = s;
	          return;
	        } else {
	          current = current.right;
	        }
	    }
	          return;
	} 
	}
	}

	public Student find(String search) {
		return null;
	}
	
	  public int count() {
		  if (root == null)
	    return 0;
		  int result = 0;
		  if (root.left != null && root.right != null)
			  result++;
		  
		  //result = 1 + count(root.left) + count(root.right);
		    return result;
	}
	  
	  public void print() {
		  if (root == null) {
			  return;
		  }
		  //print(root.left);
		  System.out.printf(root.name.toString());
		  //print(root.right);
	}
	  
	  public void printPreOrder() {
		  if (root == null) {
			  return;
	} 
		  System.out.print(root.name + " ");
		  //PreOrder(root.left);
		  //PreOrder(root.right);

}
}
