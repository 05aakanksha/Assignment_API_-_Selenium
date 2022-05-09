
package excelSheetAssignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SetSizeWindow {
	@Test
	public void sizeOfWindow() throws InterruptedException {
		WebDriver d; // Driver Object for Interface
		String url = "http://openclinic.sourceforge.net/openclinic/home/index.php";
		System.setProperty("webdriver.edge.driver","D:\\edgedriver_win64\\msedgedriver.exe"); // Setting the
																									// browser
																									// name,Setting the
																									// path of the
																									// webdriver
		d = new EdgeDriver(); // Creating object for the edge driver class
		Dimension dim = new Dimension(300, 600);
		d.manage().window().setSize(dim);
		Thread.sleep(5000);
		d.manage().window().maximize();
		Thread.sleep(5000);
//Dimension dim= new Dimension(300,600);
		d.manage().window().setSize(dim);
		d.get(url); // Launch the application
	}
}
