
import java.util.*;

public class SetExample2 {

    public static void main (String[] argv)
    {
	LinkedList<String> favoriteShows1 = new LinkedList<>();
	favoriteShows1.add ("Seinfeld");
	favoriteShows1.add ("Friends");
	favoriteShows1.add ("Sherlock");
	favoriteShows1.add ("Simpsons");
	favoriteShows1.add ("Yes minister");

	LinkedList<String> favoriteShows2 = new LinkedList<>();
	favoriteShows2.add ("Walking Dead");
	favoriteShows2.add ("Simpsons");
	favoriteShows2.add ("Game of Thrones");
	favoriteShows2.add ("Grey's Anatomy");
	favoriteShows2.add ("Seinfeld");

	computeUnion (favoriteShows1, favoriteShows2);
    }

    static void computeUnion (LinkedList<String> listA, LinkedList<String> listB)
    {
	System.out.println ("Union: ");
	
	for (String s: listA) {
	    System.out.println (" " + s);
	}

	for (String s: listB) {
	    if ( ! listA.contains(s) ) {
		System.out.println (" " + s);
	    }
	}
    }

}
