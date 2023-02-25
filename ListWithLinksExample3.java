
public class ListWithLinksExample3 {

    public static void main (String[] argv)
    {
	ListWithLinks favoriteShows1 = new ListWithLinks();
	favoriteShows1.add ("Seinfeld");
	favoriteShows1.add ("Friends");
	favoriteShows1.add ("Sherlock");
	favoriteShows1.add ("Simpsons");
	favoriteShows1.add ("Yes minister");

	favoriteShows1.printList ();
	favoriteShows1.printWithAddresses ();
    }

}
