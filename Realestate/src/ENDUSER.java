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
	//	@Test(priority=2)
	//	public void search() throws InterruptedException {
//			//sale property
//			//mousehover on properties
//			Actions action1=new Actions(driver);
//			   action1.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/a"))).build().perform();
//			   Thread.sleep(5000);
//			   //mousehover on sale
//			   Actions action2=new Actions(driver);
//			   action2.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/ul/li[1]/a"))).build().perform();
//			   Thread.sleep(5000);
//			   driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/ul/li[1]/ul/li[1]/a")).click();
//			   Thread.sleep(2000);
//			//rent property
//		//	mousehover on properties
//			Actions action3=new Actions(driver);
//			   action3.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/a"))).build().perform();
//			   Thread.sleep(5000);
//			   //mousehover on rent
//			   Actions action4=new Actions(driver);
//			   action4.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/ul/li[1]/a"))).build().perform();
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[4]/ul/li[1]/ul/li[2]/a")).click();
//			   Thread.sleep(2000);
//			
			
		//}	
//		@Test(priority=2)
//		public void reg() throws InterruptedException	 {
//			//agent registration
//			//mousehover agentzone
//			Actions action5=new Actions(driver);
//			   action5.moveToElement(driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[2]/a"))).build().perform();
//			   Thread.sleep(5000);
//			   //click post property free
//			   driver.findElement(By.xpath(".//*[@id='undefined-sticky-wrapper']/div/div/div/div/nav/ul/li[2]/ul/li/a")).click();
//			   Thread.sleep(5000);
//			   //registration of agent
//			   
//			   driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("abc");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='contact_prson']")).sendKeys("dfghjk");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='cmpny_email']")).sendKeys("pooja@gmail.com");
//			   Thread.sleep(2000);
//			   //upload
//			   WebElement upload=driver.findElement(By.xpath("//input[@id='profile_image']"));
//				upload.sendKeys("C:\\Users\\HP\\Pictures\\Screenshot\\pic.jpeg");
//			
//			   driver.findElement(By.xpath("//input[@id='mobile_phone']")).sendKeys("9732548745");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='work_phone']")).sendKeys("9738548745");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//textarea[@id='about_me']")).sendKeys("dfghjk");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='agnt_password']")).sendKeys("agentdemo");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//input[@id='agnt_cpassword']")).sendKeys("agentdemo");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//form[@id='agent_registration']//input[@name='submit']")).click();
//			   Thread.sleep(2000);
//			   
//			
//		}
//		//search
//		@Test(priority=2)
//		public void searchproperty() throws InterruptedException {
//			//search
//			driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//button[1]")).click();
//			   Thread.sleep(2000);
//			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@class='site-search-module']//div[3]//div[1]//button[1]")).click();
//			   Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@id='new_city']//button[@class='btn dropdown-toggle selectpicker btn-default']")).click();
//			   Thread.sleep(2000);   
//		    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg']")).click();
//			   Thread.sleep(2000);  
//			   
//			   //advance search
//	 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//	 Thread.sleep(2000);		   
//			
//	driver.findElement(By.xpath("//a[@id='ads-trigger']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='min_price']")).clear();
//	Thread.sleep(2000);
//    driver.findElement(By.xpath("//input[@id='min_price']")).sendKeys("5000");
//	 Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='max_price']")).clear();
//	Thread.sleep(2000);   
//    driver.findElement(By.xpath("//input[@id='max_price']")).sendKeys("10000");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg']")).click();
//	Thread.sleep(2000);
//			
//			
//		}
//		
		
		
			   
			 
			
			
			
			
			
		
//		@AfterTest
//		public void close() {
//			driver.close();
//			
//		}


	}


