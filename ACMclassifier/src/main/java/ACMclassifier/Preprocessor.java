package ACMclassifier;

import java.util.*;

public class Preprocessor {
	
	static String[] stopList = {
			
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
	
	//Constructor
	public Preprocessor() {
		
		//Populate stopList HashSet
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
	public static HashMap<String, Integer> mapWordFrequencies(String[] tokenArray) {
		
		HashMap<String, Integer> rawSignature = new HashMap<>();
		
		for (String token : tokenArray) {
			
			Integer integer = rawSignature.get(token);
			
			if (integer == null) {
				rawSignature.put(token, 1);
			} else {
				rawSignature.put(token, integer + 1);
			}
			
		}
		
		return rawSignature;
	}
	
	//Prune undesired words from the signature using the stop list
	public static void pruneStopWords(HashMap<String, Integer> rawSignature) {
		
		for (String stopWord : stopList) {
			
			if (rawSignature.containsKey(stopWord)) {
				rawSignature.remove(stopWord);
			}
				
		}
		
	}
	
}
