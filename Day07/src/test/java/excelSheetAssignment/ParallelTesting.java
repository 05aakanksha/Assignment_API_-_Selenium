package excelSheetAssignment;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class ParallelTesting {





WebDriver driver;





@BeforeClass
public void BeforeMethod() throws Exception {



}




@Test
public void edgeTest() {
System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
WebDriver d = new EdgeDriver();
d.get("https://www.rediff.com");
d.manage().window().maximize();
d.quit();
}





@Test
public void firefoxTest() {
System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.get("https://www.rediff.com/");
d.manage().window().maximize();
d.quit();
}
}