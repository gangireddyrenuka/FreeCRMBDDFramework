package stepDefenations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefenation {
	
	WebDriver driver;

@Given("^user is already in login page$")
public void user_is_already_in_login_page(){
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Kaushik/github/FreeCRMBDDFramework/driverexcutables/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://classic.freecrm.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
}

@When("^title of the login page is free crm$")
public void title_of_the_login_page_is_free_crm() throws Throwable {

	 String title=driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

}

@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_is_enters_and( String username , String password) throws Throwable
{
	driver.findElement(By.name("username")).sendKeys(username);

	driver.findElement(By.name("password")).sendKeys(password);
}

@Then("^user clicks on login page$") 
public void user_clicks_on_login_page() throws Throwable
{
WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
loginBtn.click();


	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].click();" ,loginBtn);
}
@Then("^user is on home page$")
public void user_is_on_home_page() throws Throwable {
	
	String title=driver.getTitle();
	System.out.println("Home page title::" + title);
Assert.assertEquals("COGMENTO", title);
			
 }
@Then("^user moves to contacts page$")
public void user_moves_to_contacts_page() throws Throwable {
	
	
	
	driver.switchTo().frame("mainpanel");
	Actions act=new Actions(driver);
	WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts']"));
	act.moveToElement(contact).build().perform();
	
	WebElement newContact=driver.findElement(By.xpath("//a[@title='New Contact']"));
	act.moveToElement(newContact).click().build().perform();
	 WebElement frame=driver.findElement(By.xpath("//iFrame[@src='https://onesignal.com/webPushAnalytics']"));
	 driver.switchTo().frame(frame);
	
}

@Then("^user clicks on contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and_and(String firstname, String lastname, String position) throws Throwable {
    
	
	WebElement frame2=driver.findElement(By.xpath("//span[text()='manifest']"));
	driver.switchTo().frame(frame2);
	WebElement frame1=driver.findElement(By.xpath("//iframe[@id=downloadFrame']/parent::div"));
	 driver.switchTo().frame("downloadFrame");

	Thread.sleep(3000);
	
    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
    
    driver.findElement(By.name("surname")).sendKeys(lastname);
    
    driver.findElement(By.name("company_position")).sendKeys(position);
    
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    
    }

@Then("^close the browser$")
public void close_the_browser() throws Throwable
{
	
	driver.quit();
	}
	
	
	
	

}
