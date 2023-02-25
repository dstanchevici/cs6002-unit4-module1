import java.util.*;

public class BigWordAnalysis2 {

    public static void main (String[] argv)
    {
	int bigWordLength = 12;

	ListWithLinks bigWords1 = getBigWords ("alice.txt", bigWordLength);
	ListWithLinks bigWords2 = getBigWords ("sherlockholmes.txt", bigWordLength);

	ListWithLinks commonBigWords = findCommon (bigWords1, bigWords2);

	System.out.println (commonBigWords.size() + " words in common");
	commonBigWords.printList ();
    }

    static ListWithLinks getBigWords (String filename, int wordSize)
    {
	IOTool.openFileByWord (filename);

	ListWithLinks bigWords = new ListWithLinks ();

	String w = IOTool.getNextWord ();

	while (w != null) {
	    if (w.length() >= wordSize) {
		bigWords.add (w);
	    }
	    w = IOTool.getNextWord ();
	}

	return bigWords;
    }

    static ListWithLinks findCommon (ListWithLinks words1, ListWithLinks words2)
    {
	ListWithLinks common = new ListWithLinks ();
	for (int i=0; i < words1.size(); i++) {
	    String word = words1.get(i);
	    if ( words2.contains(word) ) {
		common.add (word);
	    }
	}
	return common;
    }
}
