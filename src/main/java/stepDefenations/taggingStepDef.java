
//package stepDefenations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//
//public class taggingStepDef {
//	
//	 WebDriver driver;
//	@Given("^user is already in login page$")
//	public void user_is_already_in_login_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Kaushik/github/FreeCRMBDDFramework/driverexcutables/chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("https://classic.freecrm.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		
//		driver.findElement(By.name("username")).sendKeys("batchautomation");
//		driver.findElement(By.name("password")).sendKeys("test@1234");
//		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
//		loginBtn.click();
//		
//		//Actions act=new Actions(driver);
//		
//		
//		//driver.switchTo().frame("mainpanel");
//	}
//
//	@Given("^user is already in contact page$")
//	public void user_is_already_in_contact_page() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts']"));
//		act.moveToElement(contact).build().perform();
//		
//		WebElement newContact=driver.findElement(By.xpath("//a[@title='New Contact']"));
//		act.moveToElement(newContact).click().build().perform();
//		 WebElement frame=driver.findElement(By.xpath("//iFrame[@src='https://onesignal.com/webPushAnalytics']"));
//		  driver.switchTo().frame(frame);
//
//	}
//
//	@Given("^user is already in deal page$")
//	public void user_is_already_in_deal_page() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Deals']"));
//		act.moveToElement(contact).build().perform();
//
//	}
//
//	@Given("^create a newdeal page test$")
//	public void create_a_newdeal_page_test() throws Throwable {
//		Actions act=new Actions(driver);
//		WebElement newContact=driver.findElement(By.xpath("//a[@title='New Deal']"));
//		act.moveToElement(newContact).click().build().perform();
//	}
//
//	@Given("^create a new task page test case$")
//	public void create_a_new_task_page_test_case() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Tasks']"));
//		act.moveToElement(contact).build().perform();
//	    
//	}
//
//	@Given("^create a new report page test case$")
//	public void create_a_new_report_page_test_case() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Reports']"));
//		act.moveToElement(contact).build().perform();
//	    
//	}
//
//	@Given("^create a new docs page test case$")
//	public void create_a_new_docs_page_test_case() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Docs']"));
//		act.moveToElement(contact).build().perform();
//	}
//
//	@Given("^create a new forms page test case$")
//	public void create_a_new_forms_page_test_case() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Forms']"));
//		act.moveToElement(contact).build().perform();
//	   
//	}
//
//	@Given("^close the browser$")
//	public void close_the_browser() throws Throwable
//	{
//		
//		driver.quit();
//	}
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	

//}

	
