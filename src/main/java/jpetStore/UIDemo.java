package jpetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIDemo {
	
	@Test
	public void verifyPageTitle()
	{
		WebDriverManager.chromiumdriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jpetstore.aspectran.com/");
		
		String title= driver.getTitle();
		System.out.println("Title of the page is :"+title);
		
		driver.close();
		System.out.println("Driver closed successfully ....");
	}

}
