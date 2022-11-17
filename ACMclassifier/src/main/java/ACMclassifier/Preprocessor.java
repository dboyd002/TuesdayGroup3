package ACMclassifier;

import java.util.*;

public class Preprocessor {
	
	String[] stopList = {
			
			"a",
			"and",
			"it",
			"the",
			"to",
			"be",
			"this",
			"have",
			"from",
			"some",
			"would",
			"like",
			"than",
			"and",
			"this",
			"which",
			"do",
			"into",
			"who",
			"what",
			"when",
			"where",
			"had",
			"are",
			"as",
			"we",
			"about",
			"did",
			"with",
			"will",
			
	};
	
	Set<String> stopListSet = new HashSet<String>();
	
	public Preprocessor() {
		
		for (int i = 0; i <= stopListSet.size(); i++) {
			stopListSet.add(stopList[i]);
		}
		
	}
	
	
	
	//Accessors:
	
	//Stored in class Document
	//getRawSignature()
	
	//Stored in class Document
	//getTokens()
	
	//Stored in class Interface
	//getStopList()
	
	//Mutators:
	
	public void normalizeRawSignature() {
		
		
		
	}
	
	//Use tokens from Document class to count the word frequency
	public int countWordFrequency() {
		
		return 0;
	}
	
	//Prune undesired words from the signature using the stop list
	public void pruneStopWords() {
		
		
		
	}
	
}
