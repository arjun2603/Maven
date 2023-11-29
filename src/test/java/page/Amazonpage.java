package page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazonpage {

	WebDriver driver;
	
	By mobile=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	
	By click=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	
	By mobilephone=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a");
	
	By cart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	
	public Amazonpage(WebDriver driver) 
	{
		this.driver=driver;	
	}
	public void setvalues(String mobiles)
	{
	driver.findElement (mobile).sendKeys(mobiles);
	
	}
	public void login()
	{
		
	driver.findElement(click).click();
	
	}
	
	public void window()
	{
		String window = driver.getWindowHandle();
		
Set <String> allWindowHandles = driver.getWindowHandles();
		
		for (String Handle : allWindowHandles)
		{
			if(!Handle.equalsIgnoreCase(window))
			{
				driver.switchTo().window(Handle);
				
				
				driver.close();
	}}
		
	}
	public void login1()
	{
	driver.findElement(mobilephone).click();
		
	}
	
	public void login2()
	{
		
	driver.findElement(cart).click();
	
	}
	
	
	
	
}
