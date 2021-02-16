package wbaProjects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//1. Define WebDriver as type driver
	WebDriver driver;
	//2. define driverPath as a string type with the location to the driver 
	String driverPath  = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe"; 
	//3. define the baseUrl
	String baseUrl = "https://the-internet.herokuapp.com/"; 
	//4. set property of webdriver to the location of the webdriver 
	System.setProperty("webdriver.chrome.driver",driverPath); 
	//5. Create a new instance of the driver class 
	driver = new ChromeDriver(); 
	//6. navigate to the URL
	driver.get(baseUrl);
	driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
	/*on click, a new button is added to the page and to validate this action
	we can derive the text on the button using getText() or by comparing the text
	on the both buttons using the AssertEquals() method 
	*/
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//method 1: getting the text on the newly added button
	System.out.println(driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).getText());
	//method 2:comparing the text on both buttons using the equals method
	String Actual = "Add Element";
	String Expected = "Delete";
	System.out.println(Actual.equals(Expected));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).getText());

	
	}
	

}


