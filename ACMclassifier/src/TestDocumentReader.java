package ACMclassifier;

import ACMclassifier.DocumentReader;
import org.junit.Test;
import org.junit.Assert;

public class TestDocumentReader {
	
	@Test	
	void TestDocumentReaderConstructor() {
		
		DocumentReader docP = new DocumentReader();
		File file = new File(filePath);
		assertTrue(file.exists());
		
	}

}
