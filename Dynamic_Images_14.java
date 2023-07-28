package Interview_Questions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dynamic_Images_14 {
	
	@Test
	public void imageHandling() {
	WebDriver driver = new ChromeDriver();
	System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
    driver.manage().window().maximize();
	driver.get("https://www.ajio.com/shop/men");
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(15));
	Actions action = new Actions(driver);
	WebElement e = driver.findElement(By.xpath("//div[@class='banner-components-runtime']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[5]//div[1]//div[1]//a[2]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='banner-components-runtime']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[5]//div[1]//div[1]//a[2]")));
	action.moveToElement(e).click();
    action.build().perform();
    driver.quit();

}
}