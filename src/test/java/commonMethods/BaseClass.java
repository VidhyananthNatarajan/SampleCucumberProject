package commonMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.OrangeHRM.Utiliites.Reporter;


public class BaseClass extends Reporter  {
	
	public static ChromeDriver driver;
	
@BeforeMethod
public void LaunchApp() {
		
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String baseURL ="https://opensource-demo.orangehrmlive.com/";
	
	driver.get(baseURL);
	
	//Maximize the window
	
	driver.manage().window().maximize();
	
	
	//Title
	
	String title = driver.getTitle();
	System.out.println("Title of the page is:" +title);
	
	
}


@AfterMethod
public void teardown() {
	driver.close();
}


}
