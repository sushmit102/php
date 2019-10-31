package phpp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import tra.Base;
import tra.Hotel1;



 
public class ValidationHotel extends Base {
    @BeforeTest
    public void precondition() throws Exception {
    
        driver=Myaccount();
        
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    
    }
    
	
	@Test
    public void validatehotel() throws IOException, InterruptedException
    {
		Hotel1 hot=new Hotel1(driver);
		hot.Hotelsearch();
        log.info("successful");
        driver.close();
    }

 

}