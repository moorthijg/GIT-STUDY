package Interview_Questions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Links_68 {
	 
	
	@Test
	public void launching() {
		WebDriver driver = new ChromeDriver();
		System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	    driver.get("https:\\www.google.co.in"); 
	    WebElement a = driver.findElement(By.name("q"));
	    a.sendKeys("What is GRE and how to clear it ?"+ Keys.ENTER);
	    
	    String url = "";
	    List<WebElement> list = driver.findElements(By.tagName("A"));
	   	
	    // finding number of links present in the webpage
	    
	    int b = list.size();
	    System.out.println(b);
	    for (int i =0 ; i<b;i++) {
	    	System.out.println(list.get(i).getText());
	    for (WebElement links:list) {
	    	url = links.getText();
	    	System.out.println(url);
	    	try {
	    		String s ="";
	    		URL url1 = new URL(s);
	    		HttpURLConnection hc = (HttpURLConnection) url1.openConnection();
	    		hc.setConnectTimeout(5000);
	    		if (hc.getResponseCode()>=400) {
	    			System.out.println("Broken link is " + url1);
	    		}
	    		else {
	    			System.out.println("connection is" + hc.getResponseMessage());
	    		}
	    	}
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    	}	
	    }
	    driver.close();
	}
	

}
