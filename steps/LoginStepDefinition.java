package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {
	
	//public static ChromeDriver driver;
	
	//WebDriver wait;

	@Given("Launch the browser")
	public void launch_the_browser() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@Given("Load the url")
	public void load_the_url() {
	    driver.get("https://d2mojgetgp5xie.cloudfront.net/login");
	}

	@Given("Enter the username as {string}")
	public void the_username_as_customer_infoez_com(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	}
	

	@Given("Enter the password as Customer@{int}")
	public void enter_the_password_as_customer(Integer int1) {
	   driver.findElement(By.id("password")).sendKeys("Customer@123");
	}
	

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	    driver.findElement(By.xpath("(//button[contains(text(),'Sign in')])[2]")).click();
	}
	
	
	
	
	/*
	 * @When("Click on the username") public void click_on_the_username() {
	 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	 * WebElement
	 * usernameButton=wait.until(ExpectedConditions.presenceOfElementLocated(By.
	 * xpath("//span[@class='hidden sm:inline text-sm font-medium']")));
	 * //((JavascriptExecutor)driver).executeScript(
	 * "arguments[0].scrollIntoView(true);", usernameButton);
	 * //usernameButton.click(); JavascriptExecutor js=(JavascriptExecutor) driver;
	 * js.executeScript("arguments[0].click();",usernameButton);
	 * 
	 * }
	 */	 


	@Then("it should be navigated to the login page")
	public void it_should_be_navigated_to_the_login_page() {
	    System.out.println("it should navigate to the home page");
	}
	
	@Then("it shown as invalid credentials")
	public void it_shown_as_invalid_credentials() {
	   System.out.println("it shown as invalid credentials");
	}

	@Then("The Welcome message should be displayed")
	public void the_welcome_message_should_be_displayed() {
		//wait for the toast message
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//locate the element for the message
		WebElement welcomeMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Welcome back!']")));
		System.out.println(welcomeMessage.getText());
	}
	
	@Then("The Invalid Credentials message should be displayed")
	public void the_invalid_credentials_message_should_be_displayed() {
		//wait for the toast message
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(20));
		//locate the element for the message
        WebElement invalidMessage=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Invalid credentials']")));    
		System.out.println(invalidMessage.getText());
	}
	
	/*@When("Click on the username Button")
	public void click_on_the_username_button() {
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement userButton=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='radix-:r3:']")));
		userButton.click();*/
		
		//WebElement userbutton=driver.findElement(By.xpath("//button[@id='radix-:r3:']"));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()",userbutton);
		
		
		// Actions actions=new Actions(driver);
		// actions.moveToElement(userButton).build().perform(); userButton.click();
		 
	

	
	
	
	/*
	 * @When("Click on the username Button") public void
	 * click_on_the_username_button(){ WebDriverWait wait1=new
	 * WebDriverWait(driver,Duration.ofSeconds(30)); WebElement
	 * userButton=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//html")));
	 * 
	 * Actions actions=new Actions(driver);
	 * actions.moveToElement(userButton).build().perform();
	 * 
	 * userButton.click();
	 * 
	 * }
	 */
	 
	 
	/*
	 * @When("iclick on the logout button") public void
	 * iclick_on_the_logout_button() { WebDriverWait wait2=new
	 * WebDriverWait(driver,Duration.ofSeconds(20)); WebElement
	 * logoutButton=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//*[@data-testid='menu-logout']"))); logoutButton.click(); }
	 */

	//driver.findElement(By.xpath("//*[@data-testid='menu-logout']"));
	//driver.findElement(By.xpath("//li[normalize-space()='Invalid credentials']"));
}

