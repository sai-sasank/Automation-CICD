import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int j = 0;
		String[] vegetables = {"Cucumber","Brocolli","Cauliflower","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,vegetables);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		

	}
	public static void addItems(WebDriver driver,String[] vegetables)
	{
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	int j = 0;
	for(int i=0;i<products.size();i++)
	{
		String[] name = products.get(i).getText().split("-");
		String formattedName = name[0].trim();
		List al = Arrays.asList(vegetables);
		if(al.contains(formattedName))
		{
			
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if (j==vegetables.length)
			{
			break;	
			}
		}
	}
	}
}


