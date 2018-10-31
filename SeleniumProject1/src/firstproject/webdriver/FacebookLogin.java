package firstproject.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	WebDriver driver;

	public void invokeBrowse() {
		System.setProperty("webdriver.chrome.driver", "C:\\murali\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		invokeWebpage();
	}

	public void invokeWebpage() {
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("murli.adit@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tinku123");
		WebElement Login = driver.findElement(By.id("u_0_v"));
		Login.click();
		
		//driver.findElement(By.id("u_0_v")).click();
		//driver.findElement(By.linkText("Log In")).submit();

	}
	
	public static void main(String[] args) {
		FacebookLogin fb=new FacebookLogin();
		fb.invokeBrowse();
	}
}
