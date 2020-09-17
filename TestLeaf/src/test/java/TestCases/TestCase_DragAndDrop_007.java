package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase_DragAndDrop_007 {
	@Test
	public void dragDropOperation() {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	Actions action=new Actions(driver);
	action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	
	// action.dragAndDrop(drag, drop).build().perform();
	}
}
