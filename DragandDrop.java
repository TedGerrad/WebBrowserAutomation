package wbaProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

	
		WebDriver driver;
		@Test
		public void DragnDrop() {
			String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
			String url = "https://the-internet.herokuapp.com/drag_and_drop";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
			//define a variable builder as a member of the Actions class
			Actions builder = new Actions(driver);
			//define the source element to be dragged as belonging to the WebElement class
			WebElement From1 = driver.findElement(By.id("column-a"));
			//define the destination element 
			WebElement To1 = driver.findElement(By.id("column-b"));
			//perform drag and drop 
			builder.dragAndDrop(From1, To1).perform();
			//verify text changed in to 'Drop here' box 
			String textTo = To1.getText();
			if(textTo.equals("A")) {
			System.out.println("PASS: File is dropped to target as expected");
			}else {
			System.out.println("FAIL: File couldn't be dropped to target as expected");
			}
			driver.close();
			
			
		}
	
	}


