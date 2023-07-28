package Interview_Questions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Class_2 {
	
	@Test
	public void alerting() {
		WebDriver driver = new ChromeDriver();
		System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	    driver.manage().window().maximize();
		driver.get("https:\\www.google.co.in"); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();  
	}

}
