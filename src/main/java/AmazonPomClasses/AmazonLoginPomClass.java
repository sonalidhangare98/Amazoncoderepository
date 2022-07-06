package AmazonPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SignIn;
	
	public AmazonLoginPomClass(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void setUsername(String Userid)
	{
		Username.sendKeys(Userid);
	}
	
	public void clickContinue()
	{
		Continue.click();
	}
	
	public void setPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void clickSignIn()
	{
		SignIn.click();
	}
	
	

}
