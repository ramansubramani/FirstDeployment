package HandleFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void testCase1() {
		System.out.println("Test 1");
		Assert.assertTrue(true);
	}
	
}
