package Final;

public class MyHero implements Comparable<MyHero> {
	  public int year;
	  public String name;

	  // For Part 2
	  public MyHero left;
	  public MyHero right;

	  public MyHero(int year, String name) {
	    this.year = year;
	    this.name = name;

	    // For Part 2
	    this.left = null;
	    this.right = null;
	  }

	   public int compareTo(MyHero other) {  
		   return Integer.compare(year, other.year);
	  }

	  public String toString() {
	    return year + ": " + name;
	  }
	}
