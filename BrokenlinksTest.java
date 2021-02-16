package wbaProjects;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;


public class BrokenlinksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver ;
		String driverPath  = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe"; 
		String baseUrl = "https://the-internet.herokuapp.com/broken_images";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//find the total number of links in the page
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images found on page = " + imagesList.size());
		
		int invalidImageCount = 0;
		//create a for loop to open all links to check response code
		for (WebElement imgElement: imagesList) {
			if (imgElement != null) {
				try {
					HttpClient client = HttpClientBuilder.create().build();
					HttpGet request = new HttpGet(imgElement.getAttribute("src"));
					HttpResponse response = client.execute(request);
					
					//verifying response code, the HttpStatus should be 200 if not,
					//increment as invalid images count
					
					if (response.getStatusLine().getStatusCode() != 200)
						invalidImageCount++; 
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		}
		System.out.println("Total no. of invald images are " + invalidImageCount);
	}

}
