
package ExcelSheetAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDownBox {
	@Test
	public void test() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe"); // Setting the
																									// browser
																									// name,Setting the
																									// path of the
																									// webdriver
		WebDriver driver = new EdgeDriver(); // Creating object for the edge driver class
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); // Launch the application
		driver.manage().window().maximize(); // Maximizing the browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
//click on angular checkbox
			if (list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				break;
			}
		}
		driver.close();
	}
}
