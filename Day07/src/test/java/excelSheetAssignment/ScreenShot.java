package excelSheetAssignment;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

	WebDriver d; // Driver Object for Interface
	String url = "https://www.way2automation.com/angularjs-protractor/banking/#/login";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe"); // Setting the
																									// browser
																									// name,Setting the
																									// path of the
																									// webdriver
		d = new EdgeDriver(); // Creating object for the chrome driver class
		d.get(url); // Launch the application
		d.manage().window().maximize(); // Maximizing the browser

	}

	@After
	public void tearDown() throws Exception {
		d.close();
	}

	@Test
	public void test() throws IOException, InterruptedException {

//Screenshot1
		File scr1 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr1, new File("D:\\ScreenShot\\Login.png"));

		d.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();

//Screenshot2
		File scr2 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr2, new File("D:\\ScreenShot\\MyAccount.png"));

	}

}
