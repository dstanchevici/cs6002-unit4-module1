class ListItem {

    String data;
    ListItem next;
    
}


public class StrangeExample {

    public static void main (String[] argv)
    {
	ListItem first = new ListItem();
	first.data = "Seinfeld";

	ListItem second = new ListItem();
	second.data = "Friends";

	first.next = second;

	ListItem third = new ListItem();
	third.data = "Sherlock";
	second.next = third;

	ListItem fourth = new ListItem();
	fourth.data = "Simpsons";
	third.next = fourth;

	ListItem last = new ListItem();
	last.data = "Yes minister";
	fourth.next = last;

	System.out.println ("First: " + first.data);
	System.out.println ("Second: " + first.next.data);
	System.out.println ("Third: " + first.next.next.data);
	System.out.println ("Fourth: " + first.next.next.next.data);
	System.out.println ("Last: " + first.next.next.next.next.data);
	System.out.println ("Last (alt): " + last.data);
    }
}
