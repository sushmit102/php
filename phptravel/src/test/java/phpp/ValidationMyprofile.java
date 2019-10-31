package phpp;


	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;



	import tra.Base;
	import tra.Loginpage;
	import tra.Myprofile;


	 
	public class ValidationMyprofile extends Base {
		//By message=By.xpath("//h3[@class='text-align-left']");
	    @BeforeTest
	    public void preconditn() throws Exception {
	    
	        driver=Myaccount();
	        
	        driver.get(prop.getProperty("url"));
	        driver.manage().window().maximize();
	    
	    }
	    
		
		@Test
	    public void validatemyprofile() throws IOException, InterruptedException
	    {
			Loginpage log=new Loginpage(driver);
			log.Login();
			//Assert.assertEquals("Hi,amar,gu",driver.findElement(message).getText());
			
			
			Myprofile pro=new Myprofile(driver);
			pro.profileaccount();
	        
	        log.info("submit button is not working");
	        
	        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src,new File("C:\\screenshots\\login.png"));
	        
	        driver.close();
	    
	    }

	 

	}
	 


		





