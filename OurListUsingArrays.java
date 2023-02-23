public class OurListUsingArrays {

    String[] strings = new String [100];
    int numStrings = 0;

    public void add (String s)
    {
	if (numStrings < 100) {
	    strings[numStrings++] = s;
	}
    }


    public int size ()
    {
	return numStrings;
    }


    public String get (int i)
    {
	return strings[i];
    }


    public boolean contains (String s)
    {
	for (String k: strings) {
	    if (k == s) {
		return true;
	    }
	}
	return false;
    }

}
