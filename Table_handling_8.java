package Interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Table_handling_8 {
	
	@Test
	public void tableHandling() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.getProperty("web-driver.chrome.driver", "C:\\Users\\MOORTHI JAGANATHAN\\Downloads\\Testing Complete Materials\\Testing Tutorial Softwares\\chrome.exe");
	    driver.manage().window().maximize();
		driver.get("https://testuserautomation.github.io/WebTable/");
		
		String bfxpath = "//table/tbody/tr[";
		String atrxpath = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int rows_size = rows.size();
		System.out.println(rows_size);
				driver.findElement(By.xpath("//input[@name='select4']")).click();
				Thread.sleep(7000);
				System.out.println("candidate has been selected");
				
				// Writing all the details inside the table like first name, last name.
				
				for(int i = 1 ; i<rows_size;i++){
					System.out.println(rows.get(i).getText());
				}
				driver.close();
				
			}	
}