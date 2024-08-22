import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
	}

}
