import java.util.*;

public class BigWordAnalysis {

    public static void main (String[] argv)
    {
	int bigWordLength = 12;

	LinkedList<String> bigWords1 = getBigWords ("alice.txt", bigWordLength);
	LinkedList<String> bigWords2 = getBigWords ("sherlockholmes.txt", bigWordLength);

	LinkedList<String> commonBigWords = findCommon (bigWords1, bigWords2);

	System.out.println (commonBigWords.size() + " words in common");
	System.out.println (commonBigWords);
    }

    static LinkedList<String> getBigWords (String filename, int wordSize)
    {
	IOTool.openFileByWord (filename);

	LinkedList<String> bigWords = new LinkedList<> ();

	String w = IOTool.getNextWord ();

	while (w != null) {
	    if (w.length() >= wordSize) {
		bigWords.add (w);
	    }
	    w = IOTool.getNextWord ();
	}

	return bigWords;
    }

    static LinkedList<String> findCommon (LinkedList<String> words1, LinkedList<String> words2)
    {
	LinkedList<String> common = new LinkedList<> ();
	for (String word: words1) {
	    if ( words2.contains(word) ) {
		common.add (word);
	    }
	}
	return common;
    }
}
