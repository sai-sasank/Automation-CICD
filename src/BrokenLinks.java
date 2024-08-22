import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.asserts.SoftAssert;
public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	    SoftAssert a = new SoftAssert();
	    for(WebElement link : links)
	    {
	    	String url = link.getAttribute("href");
	    	HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400,"the link with Text"+link.getText()+ "is broken with code" +respCode);
	    }
		a.assertAll();
		}

}
