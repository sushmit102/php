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

public class Validationlogin extends Base {
	/*By message=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h3[1]");*/
    @BeforeTest
    public void preconditn() throws Exception {
    
        driver=Myaccount();
        
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    
    }
    
	
	@Test
    public void validatelogin() throws IOException, InterruptedException
    {
		Loginpage log=new Loginpage(driver);
		log.Login();
		/*Assert.assertEquals("Hi, amar gu",driver.findElement(message).getText());*/
		
		
		 log.info("Login sucessfully");
        
        driver.close();
    
    }

 

}
 


	


