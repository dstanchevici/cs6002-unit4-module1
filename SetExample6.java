
import java.util.*;

public class SetExample6 {

    public static void main (String[] argv)
    {
	// Read from file and get an array, one array element for each person.
	// Thus, people[i] is of type DataSet and people[i].strings has
	// all the strings associated with the i-th person.

	String fileName = "datafortwo.txt";
	DataSet[] people = DataTool.getDataSetsAsArray (fileName);
	LinkedList<String> intersection = computeIntersection (people[0].strings, people[1].strings);
	System.out.println ("In " + fileName + ": Intersection between " + people[0].name + " and " + people[1].name + " = " + intersection);

	fileName = "largedataset.txt";
	people = DataTool.getDataSetsAsArray (fileName);
	DataSet[] peopleWithMostInCommon = findPeopleWithMostInCommon (people);
	intersection = computeIntersection (peopleWithMostInCommon[0].strings, peopleWithMostInCommon[1].strings);
	System.out.println ("In " + fileName + ", " + peopleWithMostInCommon[0].name + " and " +peopleWithMostInCommon[1].name + " share the most favorite shows in common. Their shared favorites are " + intersection);
	
    }

    static DataSet[] findPeopleWithMostInCommon (DataSet[] allPeople)
    {
	int firstInd = 0;
	int secondInd = 1;
	int maxInCommon = 0;

	for (int i=0; i < allPeople.length; i++) {
	    for (int j=0; j < allPeople.length; j++) {
		if (j != i) {
		    LinkedList<String> intersection = computeIntersection (allPeople[i].strings, allPeople[j].strings);
		    // System.out.println ("Intersection between " + allPeople[i].name + " and " + allPeople[j].name + " = " + intersection);
		    if (intersection.size() > maxInCommon) {
			firstInd = i;
			secondInd = j;
			maxInCommon = intersection.size();
		    }
		}
	    }
	}

	DataSet[] peopleWithMostInCommon = new DataSet [2];
	peopleWithMostInCommon[0] = allPeople[firstInd];
	peopleWithMostInCommon[1] = allPeople[secondInd];

	//System.out.println (peopleWithMostInCommon[0].name);
	//System.out.println (peopleWithMostInCommon[1].name);

	return peopleWithMostInCommon;
    }


    static LinkedList<String> computeIntersection (LinkedList<String> listA, LinkedList<String> listB)
    {
	LinkedList<String> intersection = new LinkedList<> ();

	for (String s: listA) {
	    if ( listB.contains(s) ) {
		intersection.add (s);
	    }
	}

	return intersection;
    }

}

