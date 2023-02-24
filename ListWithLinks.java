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

    public int size ()
    {
	return numItems;
    }

    public String get (int i)
    {
	if (i >= numItems || i < 0) {
	    return null;
	}

	ListItem listPtr = front;
	for (int j=1; j<=i; j++) {
	    listPtr = listPtr.next;
	}

	return listPtr.data;
    }

    public boolean contains (String s)
    {
	if (front == null) {
	    return false;
	}

	ListItem listPtr = front;
	while (listPtr != null) {
	    if ( listPtr.data.equals(s) ) {
		return true;
	    }
	    listPtr = listPtr.next;
	}
	return false;
    }

    public void print ()
    {
	if (front == null) {
	    System.out.println ("The list is empty.");
	}
	else {
	    ListItem listPtr = front;
	    while (listPtr != null) {
		System.out.println (" " + listPtr.data);
		listPtr = listPtr.next;
	    }
	}
    }

}
