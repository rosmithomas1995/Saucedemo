package testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Saucedemologinpage;
import utilities.Excelutils;

public class Saucedemologintest extends Baseclass{
	@Test (priority = 1)
	public void verifylogin() throws Exception
	{
		Saucedemologinpage p1=new Saucedemologinpage(driver);
		String xl="D:\\Book1.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelutils.getrowcount(xl, sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String username=Excelutils.getcellvalue(xl, sheet, i, 0);
			System.out.println("username---"+username);
			String password=Excelutils.getcellvalue(xl, sheet, i, 1);
			System.out.println("password---"+password);
			p1.setvalues(username, password);
			p1.buttonclick();
			
		}
		List<WebElement> li=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
		for(WebElement v:li)
		{
			String text=v.getText();
			if(text.equals("Add to cart"))
			{
				v.click();
			}
		}
				
	}
	@Test(priority = 2)
	
     public void viewcart()
     {
	Saucedemologinpage ob=new Saucedemologinpage(driver);
	ob.cartclick();
	
	 }
	@Test(priority = 3)
	public void checkout()
	{
		Saucedemologinpage ob1=new Saucedemologinpage(driver);
		ob1.checkoutclick();
				
	}
	@Test(priority = 4)
	public void info()
	{
		Saucedemologinpage ab=new Saucedemologinpage(driver);
        ab.information("rosmi", "thomas", "680");
        ab.continuebutton();
	}
	@Test(priority = 5)
	public void fini()
	{
		Saucedemologinpage finish=new Saucedemologinpage(driver);
				finish.finishbutton();
	}
	@Test(priority = 6)
	public void backhome()
	{
		Saucedemologinpage back=new Saucedemologinpage(driver);
		back.backbutton();
			
	}
	@Test(priority = 7)
	public void burger()
	{
		Saucedemologinpage log=new Saucedemologinpage(driver);
		log.burgerclicks();
	}
	@Test(priority = 8)
	public void logout()
	{
		Saucedemologinpage log1=new Saucedemologinpage(driver);
		log1.logoutclick();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
