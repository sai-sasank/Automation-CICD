import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"))).click().build().perform();
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
		while(!driver.findElement(By.cssSelector("[class='flatpickr-month']")).getText().contains("August"))
		{
			driver.findElement(By.xpath("//body/div[10]/div[1]/span[2]")).click();
		}
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//span[@class='flatpickr-day']"));
		int count = driver.findElements(By.xpath("//span[@class='flatpickr-day']")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//span[@class='flatpickr-day']")).get(i).getText();
			if(text.equalsIgnoreCase("11"))
			{
				driver.findElements(By.xpath("//span[@class='flatpickr-day']")).get(i).click();
				break;
			}
		}
		
		
	}

}
