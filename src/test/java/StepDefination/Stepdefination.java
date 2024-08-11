package StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Browser.Browser;
import Excel.CreateAccountExcel;
import Excel.Login_Excel;
import Pages.Buynow;
import Pages.Cart;
import Pages.CreateAccount;
import Pages.HomePage;
import Pages.Homepage_Headerrr;
import Pages.Login;
import Pages.WishList;
import Screenshot.Takescreenshot;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Stepdefination {
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
	
	  @When("User login with vaild creds.")
	  public void user_login_with_vaild_creds() {
	    try {
	      Login.Login();
	       }
	    catch(Exception e)
	       {
	         System.out.println(e);
	       }
	  }
	
//	--------------------------------------------------------Create Account-----------------------------------------------------
	@Given("User clicks on the CreateAccount button")
	  public void user_clicks_on_the_create_account_button() {
	    try {
	      CreateAccount.getCreateAccount();
	       }
	   catch(Exception e)
	       {
	         System.out.println(e);
	       }
	  }
	
	@Given("user takes credentials from test data")
	  public void user_takes_credentials_from_test_data() {
	    try {
	      CreateAccountExcel.testdata();
	       }catch(Exception e)
	       {
	         System.out.println(e);
	       }
	  }
	
	@Then("the application navigates to result page")
	  public void the_application_navigates_to_result_page() {
	        try{
	      Takescreenshot.screenShot(2);
	         Browser.closeBrowser();
	         }
	        catch(Exception e)
	         {
	        System.out.println(e);
	         }
	  }
	
	//------------------------------------------------Login-----------------------------------------------------------
	@When("user give the data from excel")
	public void user_give_the_data_from_excel() throws IOException, InterruptedException {
		try {
			Login.MyAccount();
			   Login_Excel.testdata();
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
	


	@Then("the application not navigates to result page")
	public void the_application_not_navigates_to_result_page() {
    	System.out.println("invalid credentials");
    	Browser.closeBrowser();

	}

//----------------------------------------------------Homepage verfication--------------------------------------------------
	
	@And("User should verify all elements in homepage.")
	public void user_should_verify_all_elements_in_homepage() {
		try {
			
			
			Homepage_Headerrr.menu_item();
			Homepage_Headerrr.headings();
			Homepage_Headerrr.myaccount();
			Homepage_Headerrr.VerifyImages();
			 Browser.closeBrowser();
		   }catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}

	
	

//	---------------------------------------- Wishlist-----------------------------------------------

	@Given("user clicks on search box")
	public void user_clicks_on_search_box() {
		try {
			WishList.getWishList();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	@Given("user click on AddToWishlist button")
	public void user_click_on_add_to_wishlist_button() {
		try {
			WishList.AddToWishList();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	@Given("user verify mywishlist")
	  public void user_verify_mywishlist() {
	    try {
	      WishList.MyWishList();
	       }
	    catch(Exception e)
	       {
	         System.out.println(e);
	       }
	  }

	  @Then("user clicks on RemoveWishList button")
	  public void user_clicks_on_remove_wish_list_button() {
	    try {
	      WishList.RemoveWishList();
	      Browser.closeBrowser();
	       }
	    catch(Exception e)
	       {
	         System.out.println(e);
	       }
	  }
	
	//-----------------------------------------------------Cart---------------------------------------------------------

	@Given("user clicks on cart button")
	public void user_clicks_on_cart_button() {
		try {
			Cart.getCart();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	@Given("user clicks on AddToCart button")
	public void user_clicks_on_add_to_cart_button() {
		try {
			Cart.AddToCart();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	@Given("user clicks on ViewCart button")
	public void user_clicks_on_view_cart_button() {
		try {
			Cart.ViewCart();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	@Given("user click on IncreaseQty button")
	public void user_click_on_increase_qty_button() {
		try {
			Cart.IncreaseQty();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	@Then("user clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
		try {
			Cart.Checkout();
		   }
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	
	//----------------------------------------------------Payment--------------------------------------------------

	@Given("user give all the necassary details like address etc.")
	public void user_give_all_the_necassary_details_like_address_etc() {
	    try {
	    	Buynow.delivery();
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
	}
	
	@Given("user click on Payment button.")
	public void user_click_on_payment_button() {
		try {
	    	Buynow.payment();
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
	}

	@Given("user cancel the transaction.")
	public void user_cancel_the_transaction() {
		try {
	    	Buynow.Cancel_Transaction();
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
	}

	@Then("user has been logged off.")
	public void user_has_been_logged_off() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    Browser.closeBrowser();
	}
}
	