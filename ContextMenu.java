package wbaProjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url = "https://the-internet.herokuapp.com/context_menu";
		String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement elementLocator  = driver.findElement(By.id("hot-spot"));
		actions.contextClick(elementLocator).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
