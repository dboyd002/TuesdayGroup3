package ACMclassifier;

import java.util.HashSet;
import java.util.StringTokenizer;

public class Document {
	
	//Constructor
	public Document() {
		
		
	}
	
	//Break the raw String from the original document into individual words stored as Strings in a HashSet
	public static void stringToTokens(String rawFileString, HashSet<String> tokenSet) {
		
        
        StringTokenizer stringTokenizer = new StringTokenizer(rawFileString, " \t\n\r\f,.:;?![]'");
		
		while (stringTokenizer.hasMoreTokens()) {
			tokenSet.add(stringTokenizer.nextToken());	
		}
		
	}

}
