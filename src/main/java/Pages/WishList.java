package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.Assert;

import Browser.Browser;
import Screenshot.Takescreenshot;

public class WishList extends Browser {
  public static String Product;
  public static WebElement AddToWishlist;
  public static void getWishList() throws Exception {

    // driver.findElement(By.name("q")).sendKeys("toys");


    WebElement SearchBox = driver.findElement(By.xpath("//*[@aria-label='Search...']"));
    SearchBox.clear();
    Actions builder = new Actions(driver);
    Actions seriesOfActions = builder.moveToElement(SearchBox).click().sendKeys(SearchBox, "Toys");
    seriesOfActions.perform();

    WebElement dropdown =driver.findElement(By.xpath("(//*[@class='search-bar__item-title'])[2]"));
    dropdown.click();
    
    Takescreenshot.screenShot(5);
    
    
  }
  public static void AddToWishList() throws InterruptedException {
    
    try {
      WebElement AddToWishlist = driver.findElement(By.xpath("//*[@class='iWishAdd']"));
      if (AddToWishlist.isDisplayed())
      {
      System.out.println("Add to Wishlist");
      String Product= driver.findElement(By.xpath("//*[@class='product-meta__title heading h1']")).getText();
      AddToWishlist.click();
      Takescreenshot.screenShot(6);
      WebElement WishlistBtn = driver.findElement(By.xpath("//*[@id='shopify-section-header']/section/header/div/div/div[3]/div[3]/a[1]/span[2]"));
      WishlistBtn.click();
      }
    }
    catch(Exception e){
      System.out.println("Add to wishlist button not found");
      WebElement WishlistBtn = driver.findElement(By.xpath("//*[@id='shopify-section-header']/section/header/div/div/div[3]/div[3]/a[1]/span[2]"));
      WishlistBtn.click();
      
    }
    
  
    Thread.sleep(3000);
  }
    //WebElement WishlistBtn = driver.findElement(By.xpath("//*[@id='shopify-section-header']/section/header/div/div/div[3]/div[3]/a[1]/span[2]"));
    //WishlistBtn.click();
  public static void MyWishList() throws InterruptedException {
    WebElement MyWishlist = driver.findElement(By.xpath("//h1[@class='collection__title heading h1']"));
    String ActualTitle1 = driver.findElement(By.xpath("//h1[@class='collection__title heading h1']")).getText();
    String ExpectedTitle1 = "My Wishlist";
    Assert.assertEquals(ExpectedTitle1, ActualTitle1);
    System.out.println("MyWishlist");
    
    String ProductDetails= driver.findElement(By.xpath("//*[@class='product-item__title text--strong link']")).getText();
    Thread.sleep(3000);
    if(Product == ProductDetails )
      System.out.println("Equal");
    else
      System.out.println("Not Equal");
      
    
    Thread.sleep(3000);
    
  }
  public static void RemoveWishList() throws InterruptedException
  {
    WebElement RemoveToWishlist = driver.findElement(By.xpath("(//a[@title='Remove from wishlist'])[1]"));
    
    if (RemoveToWishlist.isDisplayed())
      System.out.println("Remove");
      else
      System.out.println("Remove is not displayed");
      RemoveToWishlist.click();
      
      Thread.sleep(6000);
    
    //driver.quit();
    
  }


  
  }