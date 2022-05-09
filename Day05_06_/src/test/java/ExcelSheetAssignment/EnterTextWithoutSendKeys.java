
package ExcelSheetAssignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EnterTextWithoutSendKeys {
	@Test
	public void test() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe"); // Setting the
																									// browser
																									// name,Setting the
																									// path of the
																									// webdriver
		WebDriver driver = new EdgeDriver(); // Creating object for the edge driver class
		driver.get("https://www.rediff.com/"); // Launch the application
		driver.manage().window().maximize(); // Maximizing the browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("document.getElementById('login1').value='aakanksha'");
		Js.executeScript("document.getElementById('password').value='abcdefgh12'");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}
}
