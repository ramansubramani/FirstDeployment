package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFRAME 

{
@Test
public void iFrameOperation() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	

	driver.switchTo().frame(0);
	WebElement first = driver.findElement(By.id("Click"));
	first.click();
	String text = first.getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	WebElement second = driver.findElement(By.id("Click1"));
	second.click();
	String text2 = second.getText();
	System.out.println(text2);
	
	driver.switchTo().defaultContent();
	
	java.util.List<WebElement> list = driver.findElements(By.tagName("iframe"));
	System.out.println(list.size());
}
}