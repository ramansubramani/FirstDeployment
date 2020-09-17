package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertProgram {

	public static void main(String[] args) throws InterruptedException {
		openBrowser();
		simpleAlert();
		confirmAlert();
		promptAlert();
		tearDown();
	}
	public static WebDriver driver;
	
	public static void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void simpleAlert() throws InterruptedException {
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		simple.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Simple Done");
		Thread.sleep(3000);
	}
	
	public static void confirmAlert() {
		WebElement confirm = driver.findElement(By.xpath("//body//div[@id='easycont']//div//div//div[2]//div[2]//button[1]"));
		confirm.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		System.out.println("Confirm Alert Done");
	}
	
	public static void promptAlert() throws InterruptedException {
		WebElement prompt = driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
		prompt.click();
		
		Alert promptalert = driver.switchTo().alert();
		String text = promptalert.getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		promptalert.sendKeys("RAMAN SUER");
		Thread.sleep(3000);
		promptalert.accept();
	
	}
	public static void tearDown() {
		driver.quit();
		// TODO Auto-generated method stub

	}
	
}
