package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemologinpage {
	WebDriver driver;
	@FindBy (id="user-name")
	WebElement sauceusername;
	@FindBy (id="password")
	WebElement saucepassword;
	@FindBy (id="login-button")
	WebElement saucelogin;
	
	@FindBy (xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartbutton;
	@FindBy (id="checkout")
	WebElement checkout;
	@FindBy (id="first-name")
	WebElement firstname;
	@FindBy (id="last-name")
	WebElement lastname;
	@FindBy (id="postal-code")
	WebElement postalcode;
	@FindBy (id="continue")
	WebElement continuebutton;
	@FindBy (id="finish")
	WebElement finish;
	@FindBy (id="back-to-products")
	WebElement backproducts;
	@FindBy (id="react-burger-menu-btn")
	WebElement burgermenu;
	@FindBy (xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public Saucedemologinpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	public void setvalues(String username, String password)
	{
		sauceusername.clear();
		sauceusername.sendKeys(username);
		saucepassword.clear();
		saucepassword.sendKeys(password);
	}
	public void buttonclick()
	{
		saucelogin.click();
	}
	public void cartclick()
	{
		cartbutton.click();
		
	}
	public void checkoutclick() 
	{
		checkout.click();
	}
	public void information(String fname,String lname,String pin)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		postalcode.sendKeys(pin);
	}
	public void continuebutton()
	{
		continuebutton.click();
	}
	public void finishbutton()
	{
		finish.click();
		
	}
    public void backbutton()
    {
    	backproducts.click();
    }
    public void burgerclicks()
    {
    	burgermenu.click();
    	
    }
    public void logoutclick()
    {
    	logout.click();
    }
    
}























