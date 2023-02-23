public class TestOurList {

    public static void main (String[] argv)
    {
	OurListUsingArrays shows = new OurListUsingArrays ();
	shows.add ("Seinfeld");
	shows.add ("ER");
	shows.add ("Friends");

	System.out.println ( shows.contains ("The Simpsons") );
	System.out.println ( shows.contains ("Seinfeld") );
	
    }

}
