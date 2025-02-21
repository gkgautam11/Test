package jpetStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIDemo {
	
	@Parameters("Browser")
	@Test
	public void verifyPageTitle(String BrowserName)
	{
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver= null;
		
		if(BrowserName.contains("Edge"))
		{
			WebDriverManager.chromiumdriver().setup();
			 driver= new EdgeDriver();
			
		}
		
		else if(BrowserName.contains("Chrome"))
		{
			 driver= new ChromeDriver();
		}
		
		
		
		driver.get("https://jpetstore.aspectran.com/");
		
		String title= driver.getTitle();
		System.out.println("Title of the page is :"+title);
		
		driver.close();
		System.out.println("Driver closed successfully ....");
	}

}
