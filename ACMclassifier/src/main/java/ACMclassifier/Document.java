package ACMclassifier;

public class Document {
	
	//Constructor
	public Document() {
		
		
	}
	
	//Break the raw String from the original document into individual words stored as an array of Strings
	public static String[] stringToTokens(String rawFileString) {
		
        String[] tokenArray = rawFileString.split("[, ?.@]+");
		
		return tokenArray;
	}

}
