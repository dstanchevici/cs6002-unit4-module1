class ListItem {

    String data;
    ListItem next;
    
}


public class StrangeExample3 {

    public static void main (String[] argv)
    {
	ListItem first = new ListItem();
	first.data = "Seinfeld";

	// A new pointer to first (at first)
	ListItem last = first;

	ListItem nextOne = new ListItem();
	nextOne.data = "Friends";

	// Create a link betw first and second
	last.next = nextOne;

	// Advance the "last" pointer (roving pointer)
	last = nextOne;

	// Third
	nextOne = new ListItem();
	nextOne.data = "Sherlock";
	last.next = nextOne;
	last = nextOne;

	// Fourth
	nextOne = new ListItem();
	nextOne.data = "Simpsons";
	last.next = nextOne;
	last = nextOne;

	// Last one
	nextOne = new ListItem();
	nextOne.data = "Yes minister";
	last.next = nextOne;
	last = nextOne;

	// Print by advancing the pointer
	ListItem listPointer = first;
	while (listPointer != null) {
	    System.out.println (listPointer);
	    System.out.println (listPointer.data);
	    listPointer = listPointer.next;
	}
	
    }
}
