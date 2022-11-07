# TuesdayGroup3
import java.io.*;
import java.util.Scanner;


public class DocumentReader {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter file path: ");
		String filePath = read.nextLine();
		try {
			BufferedReader  reader = new BufferedReader (new FileReader(filePath));
			System.out.println(reader.readLine());
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-geerated catch block
			e.printStackTrace();
		}
	} // end method main

}// end class
