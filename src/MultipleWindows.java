import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentWindowId= it.next();
		String ChildWindowId = it.next();
		driver.switchTo().window(ChildWindowId);
		driver.get("https://rahulshettyacademy.com");
		String Matter=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(ParentWindowId);
		WebElement name =driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(Matter);
		//Screenshot
		//File file = name.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("logo.png"));
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
