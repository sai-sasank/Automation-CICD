import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement>items=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>filteredList=items.stream().filter(item->item.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(items.size(), filteredList.size());
	}

}
