package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addproductpage {
	WebDriver driver;
	@FindBy (xpath="/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button")
	WebElement addtocart;
	
	
	
	
	
	
	
	public void addtocart()
	{
		addtocart.click();
	}

}
