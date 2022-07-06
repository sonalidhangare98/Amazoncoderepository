package AmazonTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class AmazonPojoClass {
	
	public String Baseurl="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	public String Userid="8847793195";
	public String Pass="Sonali@88";
	WebDriver driver;
	
	@BeforeClass
	public WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		return driver;
	}
	

}
