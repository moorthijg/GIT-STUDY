package Interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame_Names_17 {
	
	@Test
	public void framing() {
		WebDriver driver = new ChromeDriver();
		System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	    driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        List<WebElement> ele = driver.findElements(By.tagName("frame"));
        System.out.println("Number of frames in a page :" + ele.size());
        driver.close();
       

}
}