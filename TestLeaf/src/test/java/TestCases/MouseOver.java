package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {
	public static WebDriver   driver;
	

	public static void main(String[] args) {
		openBrowser();
		mouseAction();
	}
	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.thehindu.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Browser launched Perfectly");

	}
	
	public static void mouseAction() {
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement move = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div/header/div/div/div/nav/div[@id='main-menu']/ul/li[5]/a[1]")));
		
		//WebElement mouse = driver.findElement(By.xpath("//body/div/header/div/div/div/nav/div[@id='main-menu']/ul/li[5]/a[1]"));
		action.moveToElement(move);
		System.out.println("Mouse Overed To the Bussiness");
		
		Wait<WebDriver> eco=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class);
		
		WebElement pro=eco.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//div[@id='main-menu']//a[contains(text(),'Economy')]"));
			}
		});
		
		//WebElement Economy = driver.findElement(By.xpath("//div[@id='main-menu']//a[contains(text(),'Economy')]"));
		action.moveToElement(pro);
		action.click().build().perform();
		System.out.println("The Curser Clicked The Economy");
		driver.quit();
		
		
		
		
	}
	

}
