package demo;



	
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;

		public class testingworld {
			WebDriver driver=new ChromeDriver();
			@BeforeTest

			public void startbrowser() throws InterruptedException
			{
			
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
				   
				driver.manage().window().maximize();
				//URL
				driver.get("https://thetestingworld.com/#");
			Thread.sleep(1000);
			}
			
			@Test(priority=1)
			public  void testCase1() throws InterruptedException {
				//MouseHover functions
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'VIDEOS')]"))).build().perform();
			   Thread.sleep(3000);
			}
			   //LOGIN 
			   @Test(priority=0)
			   public void testcase2() throws InterruptedException {
			 
				driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
				Thread.sleep(1000);
			   }
			   @Test(priority=2)
			   public void navigate() throws InterruptedException {
				//NAVIGATE
				driver.navigate().forward();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("yurijrjj");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='button']")).click();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			   @Test(priority=3)
			   public void reg() throws InterruptedException {
		      //REGISTERATION

		        driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.name("jform[name]")).sendKeys("gshhdjd");
				Thread.sleep(1000);
				driver.findElement(By.name("jform[username]")).sendKeys("yrururj");
				Thread.sleep(1000);
				driver.findElement(By.name("jform[password1]")).sendKeys("tyyuu");
				Thread.sleep(1000);
			    driver.findElement(By.name("jform[password2]")).sendKeys("tyyuu");
			    Thread.sleep(1000);
				driver.findElement(By.name("jform[email1]")).sendKeys("tyhhgg");
				Thread.sleep(1000);
				driver.findElement(By.name("jform[email2]")).sendKeys("yujjhh");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='validate']")).click();
			   
				Thread.sleep(1000);
			   }
			   @Test(priority=4)
			   public void quick() throws InterruptedException {
			   
				//QUICK DEMO
				driver.findElement(By.xpath("//a[contains(text(),'Quick Demo')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='wdform_1_element_first2']")).sendKeys("yrururj");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='wdform_1_element_last2']")).sendKeys("yrururj");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='wdform_2_element2']")).sendKeys("yrururj");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='wdform_4_element2']")).sendKeys("658495");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='wdform_10_element2']")).sendKeys("2019-08-30");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='wdform_5_element2']")).sendKeys("Selenium");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='button-submit']")).click();
			    Thread.sleep(1000);
			   }
			
			@AfterTest
				public void quit() {
				
				driver.close();

			}

		


	}


