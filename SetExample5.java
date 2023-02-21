
import java.util.*;

public class SetExample5 {

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

	LinkedList<String> union = computeUnion (favoriteShows1, favoriteShows2);
	System.out.println ("union: " + union);
    }

    
    static LinkedList<String> computeUnion (LinkedList<String> listA, LinkedList<String> listB)
    {
	LinkedList<String> listC = new LinkedList<> ();

	for (String s: listA) {
	    listC.add (s);
	}
	for (String s: listB) {
	    if ( !listA.contains(s) ) {
		listC.add (s);
	    }
	}

	return listC;
    }

}
