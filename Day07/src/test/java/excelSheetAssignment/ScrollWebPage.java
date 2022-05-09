package excelSheetAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScrollWebPage {
	@Test
	public void scrolltest() {
		WebDriver d; // Driver Object for Interface
		String url = "http://openclinic.sourceforge.net/openclinic/home/index.php";
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe"); // Setting the
																									// browser
																									// name,Setting the
																									// path of the
																									// webdriver
		d = new EdgeDriver(); // Creating object for the edge driver class
		d.get(url); // Launch the application
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		((JavascriptExecutor) d).executeScript("scroll(0,400)");
		d.close();
	}
}