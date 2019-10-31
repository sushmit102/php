package phpp;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import tra.Base;

import tra.Signup;

 
public class ValidateSignUpPage extends Base {
    @BeforeTest
    public void preconditn() throws Exception {
    
        driver=Myaccount();
        
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    
    }
    
	
	@Test
    public void validatesignup() throws IOException, InterruptedException
    {
    	Signup reg=new Signup(driver);
		reg.Registrationpage();
        
        log.info("sucessfully registered");
        driver.close();
    
    }

 

}
 


 


	


