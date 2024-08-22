import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]/input")).click();
		String opt = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(opt);
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if(text.contains(opt))
		{
			System.out.println("Alert is Successful");
		}
		else
			System.out.println("Something is wrong with execution");
	}

}
