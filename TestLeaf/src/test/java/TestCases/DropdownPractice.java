package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownPractice extends Fundamental {

	@Test
	public void dropDownPractise() {
		driver.findElement(By.xpath("//li[5]//a[1]//h5[1]")).click();
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdown1);
		select.selectByIndex(2);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select1=new Select(dropdown2);
		select1.selectByVisibleText("Selenium");

		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3=new Select(dropdown3);
		select3.selectByValue("4");

		WebElement dropdown4= driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select select4= new Select(dropdown4);
		List<WebElement> options = select4.getOptions();
		System.out.println(options);
}
	}
