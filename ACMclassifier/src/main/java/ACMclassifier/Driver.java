package ACMclassifier;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

public class Driver {

	public static void main(String args[]) {
		
		//Single String to store the inputFile metadata
		String rawFileString = null;
		
		HashSet<String> tokenSet = new HashSet<String>();

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a file path:");

		String filePath = in.nextLine();

		in.close();

		try {
			rawFileString = DocumentReader.importFile(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Document.stringToTokens(rawFileString, tokenSet);
		
		java.util.Iterator<String> i = tokenSet.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}