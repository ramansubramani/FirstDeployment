package TestCases;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetScreenshotInRobot {

	@Test
	public void getScreenshotOperation() throws AWTException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\Question\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//a[text()='Download Excel']")).click();
		Robot robot=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		File destination=new File("C:\\Users\\raman\\eclipse-workspace\\TestLeaf\\Screenshot\\robot.png");
		ImageIO.write(source, "png", destination);
	}
}