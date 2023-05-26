package Final;

public class MySort {

	 public static void swap(MyHero[] a, int b, int c) {
		    
	  }

	   public static void sort(MyHero[] a) {
	    int n = a.length;
	    int i = 1;
	    
	    MyHero temp = a[i];

	    while (i < n) {
	      int j = i;
	      while (i >= 0 && temp.compareTo(a[i]) < 0) {
	        swap(a, j, j - 1);
	        j = j - 1;
	      }
	      i = i + 1; 
	    }
	  }
	}
