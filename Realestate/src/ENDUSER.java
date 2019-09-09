import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
	//	@Test(priority=0)
	//	public void loginregister() throws InterruptedException {
		
//			   //login
//			   driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='login_username']")).click();
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='login_password']")).click();
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//button[contains(text(),'Login Now')]")).click();
//			   Thread.sleep(2000);
//			   driver.switchTo().alert().accept();
//			   Thread.sleep(5000);
//			   // user registeration
//			   //click on register
//			  driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
//			   Thread.sleep(5000);
//			   
//			 
//			   
//			   driver.findElement(By.xpath("//input[@id='usr_name']")).sendKeys("abc");
//			   Thread.sleep(2000);
//			   
//			   driver.findElement(By.xpath("//input[@id='usr_email']")).sendKeys("poojasmalipatil4296@gmail.com");
//			   Thread.sleep(2000);
//			   
//			
//			   driver.findElement(By.xpath("//input[@id='usr_phone']")).sendKeys("9732458956");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='usr_password']")).sendKeys("user");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='usr_cpassword']")).sendKeys("user");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//button[contains(text(),'Register Now')]")).click();
//			   Thread.sleep(2000);
//			   driver.switchTo().alert().accept();
//			   Thread.sleep(5000);
//			   
//		}	
		@Test(priority=2)
		public void search() throws InterruptedException {
			//search property
			//mousehover on properties
			Actions action1=new Actions(driver);
			   action1.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/a"))).build().perform();
			   Thread.sleep(5000);
			   //mousehover on sale
			   Actions action2=new Actions(driver);
			   action2.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/ul/li[1]/a"))).build().perform();
			   Thread.sleep(5000);
			   driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/ul/li[1]/ul/li[1]/a")).click();
			   Thread.sleep(2000);
			   
			   
			   
		
		
		}
			   
			 
			
			
			
			
			
		
//		@AfterTest
//		public void close() {
//			driver.close();
//			
//		}


	}


