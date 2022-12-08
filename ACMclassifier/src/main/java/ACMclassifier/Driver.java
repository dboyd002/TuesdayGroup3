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

		try {
			rawFileString = DocumentReader.importFile(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(rawFileString);

	}

}