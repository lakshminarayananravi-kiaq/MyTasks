package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileCreationStepDefiniton extends BaseClass {
	
	
	//public static ChromeDriver driver;
	
	@When("Click on the username button")
	public void click_on_the_username_button() {
		 WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		 //Locate the toast message
	     By toast=By.xpath("//li[normalize-space()='Welcome back!']");
	     //locate the click button
	     By username=By.xpath("//span[@class='hidden sm:inline text-sm font-medium']");
	     //wait for the toast message to disappear
	     waits.until(ExpectedConditions.invisibilityOfElementLocated(toast));
	     //wait for the element to click
	     waits.until(ExpectedConditions.elementToBeClickable(username)).click();
	    
	}
	
	@And("Click on the profile button")
	public void click_on_the_profile_button() {
		WebDriverWait waits1=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement profileButton=driver.findElement(By.xpath("//*[@data-testid='menu-profile']"));
		waits1.until(ExpectedConditions.elementToBeClickable(profileButton)).click();
		
	}
	@And("Enter the name as {string}")
	public void enter_the_name_as_lakshmi(String name) {
		driver.findElement(By.xpath("//*[@data-testid='profile-name']")).sendKeys("lakshmi");
	}
	@And("Enter the phonenumber as {string}")
	public void enter_the_phonenumber_as(String string) {
		driver.findElement(By.xpath("//*[@data-testid='profile-phone']")).sendKeys("96265089769");
	}
	
  
	
	@When("Click on the savechanges button")
	public void click_on_the_savechanges_button() {
		WebElement save=driver.findElement(By.xpath("//button[text()='Save changes']"));
		
		Actions actions=new Actions(driver);
		actions.scrollToElement(save).perform();
		save.click();
		
	}
	@Then("profile update messages should be displayed")
	public void profile_update_messages_should_be_displayed() {
		
		
		WebElement getupdateMessage=driver.findElement(By.xpath("//div[text()='Profile updated']"));
		System.out.println(getupdateMessage);
	}

	
}
