/*

Your Name: JOANNE PISTULLI
Pace Email: JP42377P@PACE.EDU

Bubble Sort:
What is the worst case big O and what kind of input would cause that?
O(n^2) if the elements were in reverse ascending order which will cause
multiple iterations to happen with the element pairs.
Example: 3,2,1,0 sorting into 0,1,2,3.
What is the best case big O and what kind of input would cause that?
O(n) if the elements are already sorted in the ascending order then the
algorithm will determine in the first iteration that no elements pairs
need to be swapped then just *terminate*

Insertion Sort:
What is the worst case big O and what kind of input would cause that?
O(n^2) if the elements are sorted completely descending at the beginning
What is the best case big O and what kind of input would cause that?
O^n) if the elements appear in a sorted order with only one comparison
loop and no swap operation at all.

Selection Sort:
What is the worst case big O and what kind of input would cause that?
O(n^2) if you were looking for the largest element.
What is the best case big O and what kind of input would cause that?
O(n^2) if you were looking for the smallest element.

*/

package project4;

import java.util.ArrayList;
import java.util.Collection;

public class SortItOut {
	public static void main(String[] args) {
		
		Course C1 = new Course("MAT", "132:", " Calculus");
		Course C2 = new Course("CS", "241:", " Data Structures & Algorithms");
		Course C3 = new Course("CS", "113:", " Discrete Mathematics");
	    Course C4 = new Course("CIS", "151:", " Game Development for Everyone");
	    Course C5 = new Course("CS", "122:", " Computer Programming II");
	    Course C6 = new Course("MAT", "131:", " Pre-Calculus");
	    Course C7 = new Course("CS", "121:", " Computer Programming I");
	    
	    /*
	    Should be sorted in this order:
	    Course C1 = new Course("CIS", "151", "Game Development for Everyone");
		Course C2 = new Course("CS", "113", "Discrete Mathematics");
		Course C3 = new Course("CS", "121", "Computer Programming I");
	    Course C4 = new Course("CS", "122", "Computer Programming II");
	    Course C5 = new Course("CS", "241", "Data Structures & Algorithms");
	    Course C6 = new Course("MAT", "131", "Pre-Calculus");
	    Course C7 = new Course("MAT", "132", "Calculus");
	    */
	    
	    ArrayList<Course> list = new ArrayList<Course>();
	    list.add(C1);
	    list.add(C2);
	    list.add(C3);
	    list.add(C4);
	    list.add(C5);
	    list.add(C6);
	    list.add(C7);
	    
	    //Test as you please...
	    bubbleSort(list);
	    insertionSort(list);
	    selectionSort(list);
	    print(list);    
	  }

      //Bubble Sort (20%)*
	  public static void bubbleSort(ArrayList<Course> a) {
		  int len = a.size();

		    for (int i = 0; i < len - 1; i++)
		      for (int j = 1; j < len - i; j++)
		        if (a.get(j-1).compareTo(a.get(j)) > 0) {
		          Course temp = a.get(j-1);
		          a.set(j-1, a.get(j));
		          a.set(j, temp);
		        }
		  }

	  //Insertion Sort (20%)*
	  public static void insertionSort(ArrayList<Course> a) {  
		  for (int i = 1; i <a.size(); i++) {
				Course temp = a.get(i);
				int j = i - 1;
				while(j >= 0 && temp.compareTo(a.get(j)) < 0) {
						a.set(j+1, a.get(j));
						j = j -1;
					}
					a.set(j+1, temp);
				}
			}
		

	  //Selection Sort (20%)*
	  public static void selectionSort(ArrayList<Course> a){
	        int n = a.size();
	        for (int i = 0; i < n-1; i++){
	          int min = i;
	          for (int j = i+1; j < n; j++)
	            if (a.get(j).compareTo(a.get(min)) < 0)
	              min = j;
	          Course temp = a.get(min);
	          a.set(min, a.get(i));
	          a.set(i, temp);
	        }
	    }  

	  //Print (5%)* - Taken from Carmine's Class
	  public static void print(ArrayList<Course> a){
	    for (Course item : a) {
	      System.out.println(item);
	  }
	}
}
