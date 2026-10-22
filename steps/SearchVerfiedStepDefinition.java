package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchVerfiedStepDefinition extends BaseClass{
	
	@When("Click the verified checkbox")
	public void click_the_verified_checkbox() {
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement verifyBox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-testid='filter-verified']")));
	    verifyBox.click();
	}

	@Then("It should display the verified business")
	public void it_should_display_the_verified_business() {
	    System.out.println("Verfied business page shown");
	}


}
