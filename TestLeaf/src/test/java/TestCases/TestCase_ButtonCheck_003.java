package TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_ButtonCheck_003 extends Fundamental{

	@Test
	public void buttonsPerform() {
		
		WebElement button = driver.findElement(By.xpath("//img[@alt='Buttons']"));
		button.click();
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("Button Height Is:"+height+"Button width Is:"+width);
		
		
		WebElement color = driver.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);
		
	
		WebElement position = driver.findElement(By.id("position"));
		
		Point xypoint=position.getLocation();
		int x = xypoint.getX();
		int y = xypoint.getY();
		System.out.println("X position Is :" + x + "Y position Is:"+y);
		
		WebElement buttons = driver.findElement(By.id("home"));
		buttons.click();
	}
	
}
