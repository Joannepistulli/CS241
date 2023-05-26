package Final;

public class MyADT {
	 MyHero[] a;
	  int[] sets;

	  public MyADT(MyHero[] a) {
	    this.a = a;

	    this.sets = new int[a.length];
	    for (int i = 0; i < a.length; i++) {
	      sets[i] = -1;
	    }
	  }

	  public int find(int x) {
	   if(sets[x] == x) {
		   return x;
	   }
	   else
	   {
		   return find(sets[x]);
	   }
	  
	  }

	  public void union(int x, int y) {
	    int xrepresentatives = this.find(x);
	    int yrepresentatives = this.find(y);
	    
	    this.sets[xrepresentatives] = yrepresentatives;

	  }

	  public void print() {
	    for (int i = 0; i < sets.length; i++) {
	      System.out.println(sets[i] + "\t" + a[i]);
	    }
	  }
	}
