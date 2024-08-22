import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(3000);
		WebElement staticDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}	
		driver.findElement(By.partialLinkText("Checkout")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	}
}

