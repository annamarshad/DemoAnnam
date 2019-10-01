package Project.Day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void Config() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com.pk/");
		
	}
	
	
	@AfterSuite
	public void TearDown() {
		
	}

}
