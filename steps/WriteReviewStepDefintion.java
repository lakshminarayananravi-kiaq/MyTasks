package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WriteReviewStepDefintion extends BaseClass {
	
	
	@When("Click the rating and select the rating")
	public void click_the_rating_and_select_the_rating() {
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement ratingButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='filter-min-rating']")));
	    ratingButton.click();
	    
	    //Click the rating
	    WebElement ratingOption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='4.5+']")));
	    ratingOption.click();
	}

	@When("Click the Business")
	public void click_the_business() {
		WebDriverWait wait1=new WebDriverWait (driver,Duration.ofSeconds(25));
		WebElement givenBusiness=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Petal & Pour']")));
		givenBusiness.click();
		
	}

	@When("Click on the review button")
	public void click_on_the_review_button() {
	    driver.findElement(By.xpath("//button[@data-testid='write-review-btn']")).click();
	    
	}

	@When("Select the rating")
	public void select_the_rating() {
	    driver.findElement(By.xpath("//button[@data-testid='review-star-5']")).click();
	    
	}

	@Given("Enter the comment")
	public void enter_the_comment() {
	    driver.findElement(By.xpath("//textarea[@data-testid='review-comment']")).sendKeys("Delicious Biryani");
	}

	@When("Click the post review button")
	public void click_the_post_review_button() {
	    driver.findElement(By.xpath("//button[@data-testid='review-submit-btn']")).click();
	}

	@Then("Display the message as Review posted")
	public void display_the_message_as_review_posted() {
	    WebElement reviewMsg=driver.findElement(By.xpath("//div[text()='Review posted']"));
	    System.out.println(reviewMsg.getText());
	}


}
