package ACMclassifier;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {
		
		//Single String to store the inputFile metadata
		String rawFileString = null;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a file path:");

		String filePath = in.nextLine();

		in.close();

		//Read in given document as a String
		try {
			rawFileString = DocumentReader.importFile(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Tokenize given document String
		String[] tokenArray = Document.stringToTokens(rawFileString);
		
		for (int i = 0; i < tokenArray.length; i++) {
			System.out.println(tokenArray[i]);
		}

	}

}