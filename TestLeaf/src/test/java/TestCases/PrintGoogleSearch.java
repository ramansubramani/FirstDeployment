package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintGoogleSearch {
	@Test
	public void printSuggestionOperation()  {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Money Heist");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
}
}