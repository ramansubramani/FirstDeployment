package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_EditText_002 extends Fundamental{
	
	@Test
	public void editText() {
		WebElement edit = driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		edit.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Raman Tou can Do it");
		
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys("Definately You can Do");
		
		WebElement getTextBox= driver.findElement(By.name("username"));
		String GetTextValue=getTextBox.getAttribute("value");
		
		System.out.println(GetTextValue);
		

		WebElement clear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clear.clear();
		
		WebElement element = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

}
