/*
  Your Name: JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU
  
Merge Sort:
For Merge Sort, what is the worst case big O and what kind of input would cause
that? 
Worst case of big O would be O(n^2) because we assume the worst case scenario
would be every element being stored in the same bucket. This makes the algorithm 
more complicated and complex.

Given your implementation of Merge Sort, what is the best case big O and
what kind of input would cause that?
Best case of big O would be O(n+k) because we assume that the best case scenario
would be every element would be distributed in a balanced manner across the 
buckets. For examples, the number of elements spread across in each bucket 
are identical.
*/
package project5;

public class TheBucketList {
	public static void main(String[] args) {
		BucketManager bm = new BucketManager(); 
		bm.add("Be the very best. Like no one ever was ");
		bm.add("Finish watching the Squid Game."); 
		bm.add("Make sourdough bread.");
		bm.add("Complete a masters in Computer Science."); 
		bm.add("Learn an instrument.");
		bm.add("Complete a bachelors in Computer Science."); 
		bm.add("Complete a PhD in Computer Science."); 
		bm.add("Apply to college.");
		bm.add("Become a starship captain.");
		bm.print(); 
		System.out.println("----"); 
		bm.sort();
		bm.print();
		}
}
