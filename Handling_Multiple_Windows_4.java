package Interview_Questions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Multiple_Windows_4 {
	
	@Test
	public void windowing() {
		WebDriver driver = new ChromeDriver();
		System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	    driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allwindowhandles = driver.getWindowHandles();
        Iterator<String> it = allwindowhandles.iterator();
        
     // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (it.hasNext()) {
        	String ChildWindow = it.next();
        	 if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                 driver.switchTo().window(ChildWindow);
                 WebElement text = driver.findElement(By.id("sampleHeading"));
                 System.out.println("Heading of child window is " + text.getText());
        	 }
        }
        driver.quit();
	}
}