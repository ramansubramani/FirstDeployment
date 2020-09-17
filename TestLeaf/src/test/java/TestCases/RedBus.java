package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.id("sign-in-icon-down")).click();
	System.out.println("SiggUp Cliced Successfully");
	driver.findElement(By.id("signInLink")).click();
	
}
}
