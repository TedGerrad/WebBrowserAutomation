package wbaProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigestAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		String pMessage = driver.findElement(By.tagName("h3")).getText();
		System.out.println(pMessage);
	}

}
