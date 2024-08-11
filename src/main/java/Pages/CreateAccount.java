package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser;

public class CreateAccount extends Browser {
	public static void getCreateAccount()
	{
	//driver.findElement(By.xpath("//*[@id=\"create_customer\"]/button")).click();
	WebElement MyAccount = driver.findElement(By.xpath("//div[@class='header__action-item header__action-item--account']"));
	MyAccount.click();

	WebElement CreateYourAccount = driver.findElement(By.xpath("//*[@id='header-login-panel']/div/div/p[1]/button"));
	CreateYourAccount.click();
	}

	public static void CreateAccount_button_HomePage()
	{
		WebElement CreateAccount_HomePage = driver.findElement(By.xpath("(//*[@id='create_customer']/button)[1]"));
		CreateAccount_HomePage.click();
	}
}