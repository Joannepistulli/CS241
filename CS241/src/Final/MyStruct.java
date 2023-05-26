package Final;

public class MyStruct {
	MyHero root;

	  public void add(MyHero m) {
	    if (root == null) {
	      root = m;
	      return;
	    }

	    MyHero current = root;
	    while (true) {
	      if (m.year < current.year) { // This won't compile!!!
	        if (current.left == null) {
	          current.left = m;
	          return;
	        } else {
	          current = current.left;
	        }
	      }
	      else  {
	        
	          // Add to the right side??
	      
	      }
	    }
	  }

	  public void print(MyHero n) {
		  if (n == null) return;
			
			//printPath(n.current);
			System.out.println(n.name);
	  }

	  public void print() {
	    print(root);    
	  }
}
