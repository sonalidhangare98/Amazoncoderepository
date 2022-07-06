package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class ScreenShot {
	WebDriver driver;
	@AfterTest
	public void clickScreenShot(WebDriver d) throws IOException
	{
		driver=d;
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\amazonlogin\\Screenshots\\Amz.jpg");
		
		FileHandler.copy(source, dest);
		
		
	}

}
