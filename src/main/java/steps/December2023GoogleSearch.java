package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.December2023Googlebase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageObjects;



public class December2023GoogleSearch extends December2023Googlebase{
	
	PageObjects po;
	
	
	@Given("I am in the Google homepage")
	public void i_am_in_the_google_homepage() {
		
		//call the launchBrowser
		launchBrowser();
			
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
	 
		//step 1: identify or locate the element (where is that)
		// 8 locators: id, name, class name, HTML tag, link text, partial link text, X path, CSS selector
	   //WebElement searchBox = driver.findElement(By.id("APjFqb")); //locating by id
	   
		
		//step 2: perform the action
		//searchBox.sendKeys(string); //Method-when it starts with ( );
		po = new PageObjects(driver);
		po.enterSearch(string);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    
		//WebElement searchBtn;
		//searchBtn = driver.findElement(By.name("btnK")); //locating by name
		//searchBtn.click();
		
	  po.clicksearch();
		
	}

	@Then("I received related search result")
	public void i_received_related_search_result() {
	    
		WebElement resultStats;
		resultStats=driver.findElement(By.id("result-stats"));
		String myResult = resultStats.getText();
		
		System.out.println("*************************************************");
		System.out.println(myResult);
		System.out.println("*************************************************");
		
		closeBrowser();
		
		
		
	}
	

}//end class
