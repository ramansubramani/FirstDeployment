package TestCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class downloadFiles {

	@Test
	public void downloadFileOperation() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Download Excel']")).click();
		
		File filelocation=new File("C:\\Users\\raman\\Downloads");
		File[] listFiles = filelocation.listFiles();
		
		for (File file : listFiles) {
			if(file.getName().equals(listFiles))
			{
				System.out.println("The File Downloaded");
			}
		}
}
}