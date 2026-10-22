package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewFavouriteStepDefintion extends BaseClass {
	
	@When("Click on the favourite button")
	public void click_on_the_favourite_button() {
	    driver.findElement(By.xpath("//div[@data-testid='menu-favorites']")).click();    
	}
	
	@When("Click on the business saved as favourite")
	public void click_on_the_business_saved_as_favourite(){
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@alt='Naga Biryani House']")).click();
		WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(25));
	    WebElement savedBusiness=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Naga Biryani House']")));
	    savedBusiness.click();
	}
	
	@When("Click on the saved button")
	public void click_on_the_saved_button() {
	     WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(15));
	     WebElement savedButton=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Saved']")));
	     savedButton.click();
	   //driver.findElement(By.xpath("//button[text()='Saved']")).click();
	}
	
	@Then("Display the message as removed from favourites")
	public void display_the_message_as_removed_from_favourites() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement removeMessage=driver.findElement(By.xpath("//div[text()='Removed from favorites']"));
	    System.out.println(removeMessage.getText());
	}
	
	
	@When("Click on the explore button")
	public void click_on_the_explore_button() {
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement exploreButton=waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Explore']")));
		exploreButton.click();
	}
	
	@When("Click the categories dropdown and select the business")
	public void click_the_categories_dropdown_and_select_the_business() throws InterruptedException {
		//Thread.sleep(1000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//click the categories dropdown
		WebElement categoriesDropdown=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='filter-category']")));
		//driver.findElement(By.xpath("//button[@data-testid='filter-category']")).click();
		categoriesDropdown.click();
		
		//Click the Restaurant option
		WebDriverWait wait4=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement restaurantOption=wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Restaurants']")));
		restaurantOption.click();
	}
	@When("Click the SortBy dropdown and select the option")
	public void click_the_sort_by_dropdown_and_select_the_option() {
		
		//click the sortby dropdown
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement sortByDropdown=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='filter-sort']")));
		sortByDropdown.click();
		
		//Click the sortby option
		WebElement sortByOption=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Most popular']")));
		sortByOption.click();
		
	    	}
	
	@When("Click on the save button")
	public void click_on_the_save_button() {
		 WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(15));
		 WebElement saveButton=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	     saveButton.click();
	}
	
	@Then("Display the message as saved to favourites")
	public void display_the_message_as_saved_to_favourites() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement saveMessage=driver.findElement(By.xpath("//div[text()='Saved to favorites']"));
	    System.out.println(saveMessage.getText());
	}

	
	
	

}
