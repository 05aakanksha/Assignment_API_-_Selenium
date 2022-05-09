
package excelSheetAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {
	public static void main(String[] args) throws IOException {
		WebDriver d; // Driver Object for Interface
// Read properties file
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\aakanksha.tomar\\eclipse-workspace\\Day07\\src\\test\\java\\excelSheetAssignment\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\edgedriver_win64\\msedgedriver.exe"); // Setting the
																										// browser
																										// name,Setting
																										// the path of
																										// the webdriver
			d = new EdgeDriver();
			prop.get("url");
		}
	}
}
