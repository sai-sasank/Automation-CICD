import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		WebElement dateOfBirth=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		WebElement iceCreamText=driver.findElement(By.xpath(" //label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamText)).click();
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='option1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
	}

}
