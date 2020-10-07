//package stepDefenations;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsMapsStepDef {
//	
//	
//	WebDriver driver;
//
//	@Given("^user is already in login page$")
//	public void user_is_already_in_login_page(){
//		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Kaushik/github/FreeCRMBDDFramework/driverexcutables/chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("https://classic.freecrm.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		
//	}
//
//	@When("^title of the login page is free crm$")
//	public void title_of_the_login_page_is_free_crm() throws Throwable {
//
//		 String title=driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//
//	}
//
//	@When("^user enters username and password$")
//	public void user_is_enters_and(DataTable crediantials) throws Throwable
//	{
//		for(Map<String,String>data : crediantials.asMaps(String.class, String.class)){
//	
//		driver.findElement(By.name("username")).sendKeys(data.get("username"));
//
//		driver.findElement(By.name("password")).sendKeys(data.get("password"));
//	}
//	}
//
//	@Then("^user clicks on login page$") 
//	public void user_clicks_on_login_page() throws Throwable
//	{
//	WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
//	loginBtn.click();
//
//	}
//	@Then("^user moves to new deals page$")
//	public void user_moves_to_contacts_page() throws Throwable {
//		
//		
//		
//		driver.switchTo().frame("mainpanel");
//		Actions act=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[@title='Deals']"));
//		act.moveToElement(contact).build().perform();
//		
//		WebElement newContact=driver.findElement(By.xpath("//a[@title='New Deal']"));
//		act.moveToElement(newContact).click().build().perform();
//	}
//	@Then("^user clicks on deal details$")
//	public void user_enters_and_and(DataTable dealData) throws Throwable {
//	    
//		 
//		for(Map<String,String>data : dealData.asMaps(String.class, String.class)){
//			
//		
//	    driver.findElement(By.id("title")).sendKeys(data.get("title"));
//	    
//	    driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//	    
//	    driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//	    
//	    driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//	    
//	    driver.findElement(By.xpath("//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")).click();
//	    
//	    Actions act=new Actions(driver);
//	    WebElement contact=driver.findElement(By.xpath("//a[@title='Deals']"));
//	    act.moveToElement(contact).build().perform();
//	    WebElement newContact=driver.findElement(By.xpath("//a[@title='New Deal']"));
//	    act.moveToElement(newContact).click().build().perform();
//	    }
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable
//	{
//		
//		driver.quit();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
