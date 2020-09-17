package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alphabets {
	public static WebDriver driver;

	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

	public void searchIphone() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	  
	  
		
	}
	public void tearDown() {
		driver.quit();

	}
	public static void main(String[] args) {
		launchBrowser();
	}
}