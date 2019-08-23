import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
	public static WebDriver driver;
	@Test
	public void setup()
	{

	//String driverpath = System.getProperty("user.dir")+"\\src\\test\\java\\Browser_driver\\chromedriver.exe";
	
	//System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriverManager.chromedriver().setup();  //or we can do with this method also by adding webdriver manager dependencies in xml file
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
}
