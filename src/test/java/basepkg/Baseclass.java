package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	String baseurl="https://www.saucedemo.com";
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

}
