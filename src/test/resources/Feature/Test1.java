package StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Browser.Browser;
import Excel.Excel;
import Pages.Cart;
import Pages.HomePage;
import Pages.Login;
import Pages.LoginFailed;
import Pages.LoginSuccess;
import Pages.RecoverPassword;
import Pages.WishList;
import Screenshot.Takescreenshot;
import io.cucumber.java.en.*;


public class Test1 {
	WebDriver driver;
	@Test
	@Given("User opens the browser")
	public void user_opens_the_browser() {
		 try {
		    	Browser.setDriver();
			   }
		 catch(Exception e)
			   {
				   System.out.println(e);
			   }
	}

	/*
	 * @And("User enters url {string} in the browser") public void
	 * user_enters_url_in_the_browser(String string) { try { Browser.getUrl(string);
	 * }catch(Exception e) { System.out.println(e); } }
	 */
	@Given("User open the website in the browser")
	public void user_open_the_website_in_the_browser() {
		try {
			 Browser.Website();
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	@When("user give the data from excel")
	public void user_give_the_data_from_excel() throws IOException, InterruptedException {
		try {
			Login.MyAccount();
			   Excel.testdata();
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
	
	}



	
	@And("user hits on login button")
	public void user_hits_on_login_button() {
		try {
			Login.getLogin();
		   }
	 catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	@When("user give {string} and {string}")
	public void user_give_and(String string, String string2) {
    try {
	    	LoginFailed.getLoginFailed(string,string2);
		   }
	 catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}

	@Then("the application not navigates to result page")
	public void the_application_not_navigates_to_result_page() {
    	System.out.println("invalid credentials");
    	Browser.closeBrowser();

	}

	@Then("user clicks on WishList section")//getWishList()
	public void user_clicks_on_wish_list_section() {
		try {
	    	WishList.getWishList();
		   }
	 catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}

	

	@Then("user backs to main page")
	public void user_backs_to_main_page() {
		
		Browser.closeBrowser();
	}

	@Then("user clicks on Cart section")//getCart
	public void user_clicks_on_cart_section() {
		try {
			Cart.getCart();
			Browser.closeBrowser();
		   }
	 catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}

	@Then("user clicks on RecoverPassword section")//getRecoverPassword
	public void user_clicks_on_recover_password_section() {
		try {
			RecoverPassword.getRecoverPassword();
			Browser.closeBrowser();
		   }
	 catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}

	

	
	
}
