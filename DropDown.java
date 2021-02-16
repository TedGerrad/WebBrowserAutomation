package wbaProjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
		public WebDriver driver;
		@Test
		public void preliminaries() {
			String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
			String url = "https://the-internet.herokuapp.com/dropdown";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
			//import the select package
			Select drpOption = new Select(driver.findElement(By.id("dropdown")));
			//select dropdown option 1
			drpOption.selectByVisibleText("Option 1"); 
			System.out.println(driver.findElement(By.id("dropdown")).getText());
			//validate test
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			x getScreenshotAs(OutputType(x).target )
		
	}

}
