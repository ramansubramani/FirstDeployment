package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_AutoCompletion_008 {
	@Test
	public void autoComplitionOperation() throws AWTException {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/autoComplete.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement search = driver.findElement(By.id("tags"));
	search.sendKeys("s");
	
	Robot robot=new Robot();
	for (int i = 0; i <3; i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	
	}
	
//	robot.keyPress(KeyEvent.VK_DOWN);
//	robot.keyRelease(KeyEvent.VK_DOWN);
//	
//
//	robot.keyPress(KeyEvent.VK_DOWN);
//	robot.keyRelease(KeyEvent.VK_DOWN);
	

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
