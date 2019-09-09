import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ENDUSER {


		WebDriver driver=new ChromeDriver();
		@BeforeTest

		public void startbrowser() throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			//URLhttp
			driver.get("http://real-estate.itechscripts.com/index.php");
			Thread.sleep(1000);
			String actualtitle=driver.getTitle();
			System.out.println("The title of the page is:"+actualtitle);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File file=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\HP\\Pictures\\Screenshot\\pic.jpeg"));
			Thread.sleep(2000);
			System.out.println("Saved the screenshot");
			
			
	       

		}
		@Test(priority=0)
		public void mousehover() {
		
			
			
			
			
			
		}
		@AfterTest
		public void close() {
			driver.close();
			
		}


	}


