package firstproject.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClasss {

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
		driver.get("https://www.edureka.co");

		logIn();
	}

	public void registration() {
		driver.findElement(By.xpath("/html/body/div[2]/header/section/nav/div/a[1]")).click();
		driver.findElement(By.id("signupname")).sendKeys("muralidhar");
		driver.findElement(By.id("signupemail")).sendKeys("muralidongara@gmail.com");
		driver.findElement(By.id("signuptel")).sendKeys("9603988091");
		driver.findElement(By.id("pwd3")).sendKeys("Vivek@123");
		driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div[2]/div[2]/div/form/div[6]/p")).submit();

	}

	public void logIn() {

		try {
			driver.findElement(By.xpath("/html/body/div[2]/header/section/nav/div/a[2]")).click();

			driver.findElement(By.id("inputName")).sendKeys("muralidongara@gmail.com");

			Thread.sleep(8000);

			// TODO Auto-generated catch block

			driver.findElement(By.id("pwd1")).sendKeys("Vivek@123");
			driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div[2]/div[1]/div[1]/form/div[4]")).submit();
			
			//Scroll down page
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/section[6]/article/div[2]/div[6]/a/span"));
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			driver.findElement(By.xpath("/html/body/div[3]/section/section[6]/article/div[2]/div[6]/a/span")).click();
			

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		navigationMethods();
		
	}
	
	public void logOut() {
		
		driver.findElement(By.className("img30")).click();
		driver.findElement(By.xpath("/html/body/div[3]/header/section/nav/div/ul[2]/li[1]/ul/li[6]/a")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void navigationMethods() {
		
		 //driver.findElement(By.id("homeSearchBar")).sendKeys("JAVA");
		 //driver.findElement(By.id("homeSearchBarIcon")).click();
		  
		  String currenturl=driver.getCurrentUrl();
		  System.out.println("currenturl is"+currenturl);
		  
		  driver.navigate().back();
		  
		  logOut();
		  
		  driver.close();
	}

	public static void main(String[] args) {

		FirstClasss fs = new FirstClasss();
		fs.invokeBrowse();
	}
}
