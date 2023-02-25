class ListItem {

    String data;
    ListItem next;
}

public class ListWithLinks {

    ListItem front = null;
    ListItem rear = null;

    int numItems = 0;

    public void add (String s)
    {
	if (front == null) {
	    front = new ListItem ();
	    front.data = s;
	    rear = front;
	    rear.next = null;
	}
	else {
	    ListItem nextOne = new ListItem ();
	    nextOne.data = s;
	    rear.next = nextOne;
	    rear = nextOne;
	}

	numItems ++;
    }


    public void printWithAddresses ()
    {
	if (front == null) {
	    System.out.println ("The list is empty.");
	}

	ListItem listPtr = front;
	while (listPtr != null) {
	    System.out.println (" \"" + listPtr.data + "\" at address " + listPtr);
	    listPtr = listPtr.next;
	}
    }

}
