
import java.util.*;

public class SetExample8 {

    public static void main (String[] argv)
    {
	// Create an instance of the data structure.
	OurListUsingArrays favoriteShows1 = new OurListUsingArrays();
	favoriteShows1.add ("Seinfeld");
	favoriteShows1.add ("Friends");
	favoriteShows1.add ("Sherlock");
	favoriteShows1.add ("Simpsons");
	favoriteShows1.add ("Yes minister");

	// Create a second instance and add some elements.
	OurListUsingArrays favoriteShows2 = new OurListUsingArrays();
	favoriteShows2.add ("Walking Dead");
	favoriteShows2.add ("Simpsons");
	favoriteShows2.add ("Game of Thrones");
	favoriteShows2.add ("Grey's Anatomy");
	favoriteShows2.add ("Seinfeld");

	computeUnion (favoriteShows1, favoriteShows2);
    }

    static void computeUnion (OurListUsingArrays listA, OurListUsingArrays listB)
    {
	System.out.println ("Union:");
	for (int i = 0; i < listA.size(); i++) {
	    System.out.println (" " + listA.get(i) );
	}
	for (int i = 0; i < listB.size(); i++) {
	    if ( ! listA.contains (listB.get(i))  ) {
		System.out.println (" " + listB.get(i) );
	    }
	}
    }

}
