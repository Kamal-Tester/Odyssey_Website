package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;

public class Login extends Browser {
	public static void getLogin()
	{
	driver.findElement(By.xpath("//*[@id=\"header_customer_login\"]/button")).click();
	
	}
	
	public static void Login() throws InterruptedException
	{
	
	driver.findElement(By.xpath("//div[@class='header__action-item header__action-item--account']")).click();
	WebElement username_field=driver.findElement(By.xpath("//*[@id=\"login-customer[email]\"]"));
	
	username_field.click();
	
	username_field.sendKeys("testtest@gmail.com");

	
	
	WebElement password_field=driver.findElement(By.xpath("//*[@id=\"login-customer[password]\"]"));
	password_field.click();
	
	password_field.sendKeys("test@123");
driver.findElement(By.xpath("//*[@id=\"header_customer_login\"]/button")).click();

driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/section/header/div/div/div[1]/a/img")).click();

Thread.sleep(5000);
	}

  ///WebElement menuicon=driver.findElement(By.xpath("//span[@class='header__desktop-nav-text']")); 
  //menuicon.click();

	
	public static void MyAccount() {
		WebElement MyAccount=driver.findElement(By.xpath("//div[@class='header__action-item header__action-item--account']"));
		MyAccount.click();
	}
}
