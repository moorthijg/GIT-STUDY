package Interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Cross_browser_Test {
	
public WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void browsing(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
	System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	System.out.println("Chrome browser launched");
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			System.getProperty("web-driver.gecko.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\gecko.exe");
			System.out.println("fire browser launched");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
			System.getProperty("web-driver.edge.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\edge.exe");
			System.out.println("edge browser launched");
		}
		else if(browser.equalsIgnoreCase("headless")) {
			 driver = new HtmlUnitDriver();
			System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\headless.exe");
			System.out.println("headless browser launched"); 
		}
		else {
			System.out.println("Browser not found");
			
		}
	}
	
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
	}
	
	@Test
	public void searching() {
		 driver.get("https:\\www.google.co.in"); 
		 driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
	    
	}
}
