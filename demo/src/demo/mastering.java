package demo;




		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;

		public class mastering {
			WebDriver driver=new ChromeDriver();
			@BeforeTest
			

			public void startbrowser () throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
				driver.manage().window().maximize();
				
				//URL
				driver.get("https://selenium-vinod.blogspot.com/p/task1.html");
				Thread.sleep(1000);
			}
			@Test(priority=0)
			public void testcases() throws InterruptedException {
				driver.findElement(By.xpath("//input[@id='sel_1']")).sendKeys("pooja");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//textarea[@name='middle_Name']")).sendKeys("ghjkkm");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@id='sel_2']")).sendKeys("122");
				Thread.sleep(1000);
				//SCROLL DOWN
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1000)");
				System.out.println("scrolled Down");
				Thread.sleep(5000);
				//RADIO BUTTON
				driver.findElement(By.xpath("//body//input[6]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//body//input[11]")).click();
				Thread.sleep(1000);
				//CHECK BOX
				driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
				Thread.sleep(1000);
				//DROP DOWN BY INDEX VALUE
				driver.findElement(By.xpath("//select[@name='language']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//select[@name='language']/option[2]")).click();
				Thread.sleep(1000);
				//SCROLL DOWN
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(0,1200)");
				System.out.println("scrolled Down");
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@id='myBtn']")).click();
				Thread.sleep(1000);
				//UPLOAD FILE 
				WebElement upload=driver.findElement(By.xpath("//input[@id='FileUpload']"));
				upload.sendKeys("C:\\Users\\HP\\Documents\\ATM  Requirements.docx");
						
				Thread.sleep(1000);
				driver.findElement(By.xpath("//form[3]//input[2]")).click();
				Thread.sleep(1000);
			}
			@AfterTest
			public void aftertest() {
				driver.close();
			}

		}


	


