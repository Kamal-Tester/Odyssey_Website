package Screenshot;
	import java.io.File;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import Browser.Browser;

	public class Takescreenshot extends Browser{
		public static void screenShot(int i) throws Exception {		//String fileName
			try {
				Thread.sleep(2000);
				//Converting WebDriver object to takeScreenshoot
			TakesScreenshot scrShot =((TakesScreenshot)driver); 
			
			//Calling the getScreenshotAs() method to create an image file
			File Src=scrShot.getScreenshotAs(OutputType.FILE);	
			
			//Giving the location
			String filePath = System.getProperty("user.dir")+"//ScreenShot//Screenshot"+i+".png";
																   
			//Moving image file to new destination
			File Dest=new File(filePath);	 
		
			//copying file at destination
			FileUtils.copyFile(Src, Dest);
			
			}
			catch(Exception e)
			{
				System.out.println("Screen Capture");
			}
		}
	}


