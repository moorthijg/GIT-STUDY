package Interview_Questions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot_9 {
	
	@Test
	public void tableHandling() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	    driver.manage().window().maximize();
	    driver.get("https:\\www.google.co.in");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "D:\\screenshot.mp4";
		FileUtils.copyFile(file, new File(path));
		driver.close();
	}
}
