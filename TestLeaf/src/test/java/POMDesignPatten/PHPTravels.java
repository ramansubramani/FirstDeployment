package POMDesignPatten;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PHPTravels {
	
	public static WebDriver driver;
	public static void browserSetup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\raman\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public static void openUrl() {
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void tearDown() {
		driver.close();

	}
	
	public static void signUp() {
		WebElement Account = driver.findElement(By.xpath("(//a[@id='dropdownCurrency'])[2]"));
				Account.click();
//		Actions action=new Actions(driver);
//		action.moveToElement(Account).perform();
//		
		driver.findElement(By.xpath("//a[@class='dropdown-item tr']")).click();
		
	}
	public static void main(String[] args) {
		browserSetup();
		openUrl();
		signUp();
		//tearDown();
		
		
	}

}
