package Project.Day;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCases extends Base {
	
	
	@Test
	public void TC1() {
		driver.findElement(By.xpath("//*[@id=\'gb_70\']")).click();
		
	}

}
