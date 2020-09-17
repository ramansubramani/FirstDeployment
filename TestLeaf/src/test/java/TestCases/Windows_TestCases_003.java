
package TestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows_TestCases_003{
	
@Test
public void WindowsHandleMethod() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
	
	String OldWindow = driver.getWindowHandle();
	
	WebElement firstWindow = driver.findElement(By.id("home"));
	firstWindow.click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	for (String handle : windowHandles) {
		driver.switchTo().window(handle);
	}
	driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
	
	driver.close();
	
	driver.switchTo().window(OldWindow);
	
	
	
		WebElement multipleWindow = driver.findElement(By.xpath("//div[2]//div[1]//div[1]//button[1]"));
		multipleWindow.click();
	
	
	int size = driver.getWindowHandles().size();
	System.out.println("Number Of Window Opened " + size);
	
	WebElement closeWindow = driver.findElement(By.id("color"));
	closeWindow.click();
	Set<String> newindowHandles = driver.getWindowHandles();
	
	for (String Twowindow : newindowHandles) {
		if(!Twowindow.equals(OldWindow))
			driver.switchTo().window(Twowindow);
			driver.close();
	}
	driver.quit();
}
	
	
}

