package AmazonTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AmazonPomClasses.AmazonLoginPomClass;
import Utilities.ScreenShot;

public class AmazonLoginTestClass extends AmazonPojoClass {
		
	@Test
	public void performLogin() throws IOException
	{
	
		driver.get(Baseurl);
		
		AmazonLoginPomClass ac=new AmazonLoginPomClass(driver);
		ac.setUsername(Userid);
		
		ac.clickContinue();
		
		ac.setPassword(Pass);
		ac.clickSignIn();
		
		ScreenShot sc=new ScreenShot();
		
		sc.clickScreenShot(driver);
		
		
		
	}
	
	
	

}
