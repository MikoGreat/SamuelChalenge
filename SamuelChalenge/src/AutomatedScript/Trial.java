package AutomatedScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		driver.get("http://www.google.co.uk");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys(new String[]{"GMAIL"}); // send also a "\n"
		    element.submit();
		    Thread.sleep(2000);
		    WebElement we1 = driver.findElement(By.name("q"));
		    we1.findElement(By.xpath("//h3[text()='Gmail - Google']")).click();
         
//		    driver.close();
	}

}
