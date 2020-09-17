package HandleFailedTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Simple {

	@Test
	 public void test2(){
	 System.out.println("Test 2");
	 Assert.assertTrue(false);
	 }
}
