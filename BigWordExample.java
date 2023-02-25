
import java.util.*;

public class BigWordExample {

    static int numWords = 0;

    public static void main (String[] argv)
    {
	int bigWordLength = 10;

	// Get the big words as a linked list.
	// Here we're using Java's linked list.
	LinkedList<String> bigWords = getBigWords ("sample.txt", bigWordLength);

	// Print.
	System.out.println ("# bigWords=" + bigWords.size() + " out of " + numWords);
	System.out.println (bigWords);
    }

    static LinkedList<String> getBigWords (String filename, int wordSize)
    {
	// Open a file to read word-by-word:
	IOTool.openFileByWord (filename);

	// We'll put big words in an array list:
	// Or, is it a linked list?
	LinkedList<String> bigWords = new LinkedList<> ();

	String w = IOTool.getNextWord ();
	numWords = 0;

	while (w != null) {
	    numWords++;
	    if (w.length() >= wordSize) {
		// Add to list if big enough.
		bigWords.add (w);
	    }
	    w = IOTool.getNextWord ();
	}

	return bigWords;
    }

}
