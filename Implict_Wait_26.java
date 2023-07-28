package Interview_Questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implict_Wait_26 {
	
	@Test
	public void waiting() {
	WebDriver driver = new ChromeDriver();
	System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
    driver.get("https:\\www.google.co.in"); 
    WebElement a = driver.findElement(By.name("q"));
    driver.close();
	}
}
