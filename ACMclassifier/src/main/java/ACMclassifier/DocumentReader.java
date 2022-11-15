package ACMclassifier;
import java.io.*;
import org.apache.tika.*;
import java.util.Scanner;


public class DocumentReader {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter file path: ");
		String filePath = read.nextLine();
		parseToPlainText(filePath);
	}
	
public String parseToPlainText(String filePath) throws IOException, SAXException, TikaException {
	BodyContentHandler handler = new BodyContentHandler();
 	AutoDetectParser parser = new AutoDetectParser();
    	Metadata metadata = new Metadata();
   	try (InputStream stream = ContentHandlerExample.class.getResourceAsStream(filePath)) {
        	parser.parse(stream, handler, metadata);
        	return handler.toString();
    	}
}

}// end class
