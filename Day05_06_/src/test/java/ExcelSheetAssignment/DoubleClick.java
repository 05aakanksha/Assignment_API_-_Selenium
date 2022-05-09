
package ExcelSheetAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleClick {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text() = \"Double-Click Me To See Alert\"]"));
		Actions click = new Actions(driver);
		click.doubleClick(button).perform();
//driver.quit();
	}
}
