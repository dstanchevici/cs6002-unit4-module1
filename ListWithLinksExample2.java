
public class ListWithLinksExample2 {

    public static void main (String[] argv)
    {
	ListWithLinks favoriteShows1 = new ListWithLinks();
	favoriteShows1.add ("Seinfeld");
	favoriteShows1.add ("Friends");
	favoriteShows1.add ("Sherlock");
	favoriteShows1.add ("Simpsons");
	favoriteShows1.add ("Yes minister");

	ListWithLinks favoriteShows2 = new ListWithLinks();
	favoriteShows2.add ("Walking Dead");
	favoriteShows2.add ("Simpsons");
	favoriteShows2.add ("Game of Thrones");
	favoriteShows2.add ("Grey's Anatomy");
	favoriteShows2.add ("Seinfeld");

	System.out.println ("First list:");
	favoriteShows1.printList ();
	System.out.println ("Second list:");
	favoriteShows2.printList ();

	ListWithLinks unionList = computeUnion (favoriteShows1, favoriteShows2);

	System.out.println ("Union:");
	unionList.printList ();
    }

    static ListWithLinks computeUnion (ListWithLinks listA, ListWithLinks listB)
    {
	ListWithLinks listC = new ListWithLinks ();
	
	for (int i=0; i<listA.size(); i++) {
	    listC.add (listA.get(i));
	}

	for (int i=0; i<listB.size(); i++) {
	    String s = listB.get(i);
	    if ( !listA.contains(s) ) {
		listC.add (s);
	    }	    
	}


	return listC;
    }    

}
