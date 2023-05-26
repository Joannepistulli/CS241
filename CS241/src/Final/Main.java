/*
  Your Name: JOANNE PISTULLI
  Pace Email: JP42377P@PACE.EDU

What is the worst case and best case runtimes of MySort "sort" and Why?
The best case would be O(n) if the list is proportional to the number of
elements in our set list where it is the "correct" order.
The worse case would be O(n^2) where it is not proportional and has way 
too many elements or it's unorganized...

What is the worst case and best case runtimes of MyStruct "add" and why?
The best case would be O(log n) since it's a balanced binary tree
The worse case would be O(n) if it doesnt have any parent or children nodes

What is the worst case runtime of MyADT "find" and why?
The worse case runtime of find is O(log n) because n is the number of elements.
*/

package Final;

public class Main {
	public static void main(String[] args) {

		// ******* TESTING DATA *******
		    MyHero m1 = new MyHero(2018, "Andrew Garfield");
		    MyHero m2 = new MyHero(2019, "Tom Holland");
		    MyHero m3 = new MyHero(2019, "Toby Maguire");
		    MyHero m4 = new MyHero(2018, "Michael Keaton");
		    MyHero m5 = new MyHero(2017, "Christian Bale");
		    MyHero m6 = new MyHero(2015, "Ben Affleck");

		// ******* TESTING FOR PART 1 *******
		    MyHero[] heroes = { m1, m2, m3, m4, m5, m6 };
		    MySort.sort(heroes);
		    System.out.println("\nPART 1");
		    for (MyHero m : heroes) {
		      System.out.println(m);
		    }

		// ******* TESTING FOR PART 2 *******
		    MyStruct ms = new MyStruct();
		    ms.add(m1);
		    ms.add(m2);
		    ms.add(m3);
		    ms.add(m4);
		    ms.add(m5);
		    ms.add(m6);
		    System.out.println("\nPART 2");
		    ms.print();


		// ******* TESTING FOR PART 3 *******
		    MyHero[] heroGroup = { m1, m2, m3, m4, m5, m6 };
		    MyADT ma = new MyADT(heroGroup);
		    System.out.println("\nPART 3");
		    ma.union(1, 2);
		    ma.union(5, 4);
		    ma.union(1, 0);
		    ma.union(5, 3);
		    ma.print();
		  }
}
