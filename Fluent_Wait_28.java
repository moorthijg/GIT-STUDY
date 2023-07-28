package Interview_Questions;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Fluent_Wait_28 {
	
	@Test
	public void fluenting() {
	WebDriver driver = new ChromeDriver();
	System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
    driver.get("https:\\www.google.co.in"); 
//    FluentWait<WebDriver> wait = new FluentWait<>(driver);
//    wait.withTimeout(Duration.ofSeconds(30));
//    wait.pollingEvery(Duration.ofSeconds(5));
//    wait.ignoring(NoSuchElementException.class);
    WebElement a = driver.findElement(By.name("q"));
    
   
  
	}
}
