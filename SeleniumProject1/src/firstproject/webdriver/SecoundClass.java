package firstproject.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecoundClass {

	    WebDriver driver;
	    
	    public void ByPixel() {
	        System.setProperty("webdriver.chrome.driver", "C:\\murali\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        driver.manage().window().maximize();

	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,1000)");
	    }
	    
	    public static void main(String[] args) {
	    	
	    	SecoundClass sc=new SecoundClass();
	    	sc.ByPixel();
	    	
	    			
	    }
	}
