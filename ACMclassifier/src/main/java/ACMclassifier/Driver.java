package ACMclassifier;

import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a file path:");

		String filePath = in.nextLine();

		in.close();

		System.out.println(filePath);

		DocumentReader.docParser(filePath);

	}

}