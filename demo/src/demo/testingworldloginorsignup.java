package demo;


		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;

		public class testingworldloginorsignup {
			WebDriver driver=new ChromeDriver();
			@BeforeTest
			

			public void startbrowser() throws InterruptedException {
				
			
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				
				driver.manage().window().maximize();
				Thread.sleep(1000);
				//URL
				driver.get("https://thetestingworld.com/testings/");
				Thread.sleep(1000);
			}
			
			
			@Test(priority=0)
			public void testcases() throws InterruptedException
			{
				//LOGIN
				driver.findElement(By.xpath("//label[contains(text(),'Login')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("hshjskjs");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@placeholder='mypassword']")).sendKeys("ryurur");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='tab-content2']//div[@class='btn']//input[2]")).click();
				Thread.sleep(1000);
				//REGISTER
				driver.findElement(By.xpath("//label[contains(text(),'Register')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='myusername']")).sendKeys("hshjskjs");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='myusername@gmail.com']")).sendKeys("hshjskjsty@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hshjskjs");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys("yujhhh");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/15/2019");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("52489");
				Thread.sleep(1000);
				//ADDRESS TYPE BY RADIO BUTTON
				driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("hshjskjs");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//body//input[9]")).click();
				Thread.sleep(1000);
				//BY DROP DOWN 
				driver.findElement(By.xpath("//select[@name='sex']")).sendKeys("Female");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='countryId']")).click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//select[@id='countryId']/option[3]")).click();
			    Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='stateId']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@id='cityId']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Zip code']")).sendKeys("hshjskjs");
				Thread.sleep(1000);
//				WebElement option1=driver.findElement(By.xpath("//div[@id='tab-content1']//form[1]"));
		//if(option1.isSelected()) {
//					
//					
//					System.out.println("Checkbox Already Checked ON");
//					}
//					else {
//						
//						option1.click();
//						System.out.println("Check box Toggled OFF and Clicked");
//					}
					
				driver.findElement(By.name("terms")).click();
				
							
				
				driver.findElement(By.xpath("//li[1]//div[1]//form[1]//div[1]//input[2]")).click();
			}
			@AfterTest
			

			public void quit(){
				driver.close();
			
			}

		


	}


