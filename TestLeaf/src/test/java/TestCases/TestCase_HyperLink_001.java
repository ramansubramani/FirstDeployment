package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase_HyperLink_001 extends Fundamental{
	@Test
	public void openHyperLink() {
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();

		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
	}
}
