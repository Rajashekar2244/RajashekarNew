package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	@Test
	void open_browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Data Backup_17.07.2017\\Raja\\Selenium\\Wed Drivers\\Chrome Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		
		Boolean elePresent1 = driver.findElements(By.name("q") ).size()>0;
		Boolean elePresent2 = driver.findElements(By.name("q") ).isEmpty();
		
		System.out.println(elePresent1);
		System.out.println(elePresent2);
		
	}
}
