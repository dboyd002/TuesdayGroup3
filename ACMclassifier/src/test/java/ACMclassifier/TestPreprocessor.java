package ACMclassifier;

import ACMclassifier.Preprocessor;
import org.junit.Test;
import org.junit.Assert;

public class TestPreprocessor {
	
	@Test	
	public void TestPreprocessorConstructor() {
		
		Preprocessor p = new Preprocessor();
		org.junit.Assert.assertFalse(p.stopListSet.isEmpty());
		org.junit.Assert.assertTrue(p.stopListSet.contains("be"));
		
	}

}
