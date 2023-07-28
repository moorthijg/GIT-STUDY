package Interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_InterFace_1 {
	
	@Test
	public void mouseAction() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.browserstack.com/");

	((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	Actions ac = new Actions(driver);
	WebElement live= driver.findElement(By. cssSelector("div.product-cards-wrapper--click a[title='Live']"));
	ac.moveToElement(live).build().perform();
	Thread.sleep(8000);
	WebElement automate= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));
	automate.click();
    
    
	}
}
