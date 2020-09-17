package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_WebTable_009 {
	
/**
 * @throws AWTException
 * @throws IOException
 */
@Test
	public void webTableOperation() throws AWTException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> Column = driver.findElements(By.tagName("th"));
		int Columnsize = Column.size();
		System.out.println("The Number of Columns :" +Columnsize);
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int Rowsize = row.size();
		System.out.println("The Number Of Rows:" +Rowsize);
		
		WebElement percentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String text = percentage.getText();
		System.out.println("The Learn element Percentage Is " +text);
		
		
		List<WebElement> allprogress=driver.findElements(By.xpath("//td[2]"));
		List<Integer> main=new ArrayList<Integer>();
		for (WebElement value: allprogress) {
			String individual = value.getText().replace("%", "");
			main.add(Integer.parseInt(individual)); 
		
		}
		System.out.println("Final list:" +main);
		
		int smallvalue=Collections.min(main);
		System.out.println(smallvalue);
		
		String min = Integer.toString(smallvalue)+"%";
		System.out.println(min);
		String finalpath=("//td[normalize-space()="+"\""+ min + "\""+"]"+"//following::td[1]");
		System.out.println(finalpath);
		driver.findElement(By.xpath(finalpath)).click();
		//driver.quit();
		
	
}}
