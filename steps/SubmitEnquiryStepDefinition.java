package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitEnquiryStepDefinition extends BaseClass {

	@When("Click the send enquiry button")
	public void click_the_send_enquiry_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement enquiryButton=driver.findElement(By.xpath("//button[text()='Send Enquiry']"));
		enquiryButton.click();
		
	}

	@When("Enter the enquiry name")
	public void enter_the_enquiry_name() {
		WebElement enquiryName=driver.findElement(By.xpath("//input[@data-testid='enquiry-name']"));
		enquiryName.clear();
		enquiryName.sendKeys("lakshmi");	
		
	    
	}

	@When("Enter the enquiry phone number")
	public void enter_the_enquiry_phone_number() {
		WebElement enquiryPhonenumber=driver.findElement(By.xpath("//input[@data-testid='enquiry-phone']"));
		enquiryPhonenumber.clear();
		enquiryPhonenumber.sendKeys("6782316709");
	    
	}

	@When("Enter the message")
	public void enter_the_message() {
		WebElement entertheMessage=driver.findElement(By.xpath("//textarea[@data-testid='enquiry-message']"));
		entertheMessage.clear();
		entertheMessage.sendKeys("To know about the business");
	    
	}

	@Then("Display the message as Enquiry submitted")
	public void display_the_message_as_enquiry_submitted() {
		System.out.println("Enquiry submitted");
	    
	}
}
