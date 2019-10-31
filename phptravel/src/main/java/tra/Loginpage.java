package tra;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Loginpage {
	WebDriver driver;
	Properties  prop;
	
	public Loginpage(WebDriver driver) {
		this.driver= driver;
	}
	By Myaccount=By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By loginbt=By.xpath("//a[@class='dropdown-item active tr']");
    By Email=By.xpath("//input[@placeholder='Email']");
    By Lpassword=By.xpath("//input[@placeholder='Password']");
   
    By login=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
    
    public void Login() throws IOException {
    	prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		driver.findElement(Myaccount).click();
		driver.findElement(loginbt).click();
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Lpassword).sendKeys(prop.getProperty("Lpassword"));
		
		driver.findElement(login).click();
		Assert.assertTrue(driver.findElement(login).isDisplayed());;
    }

	public void info(String string) {
		// TODO Auto-generated method stub
		
	}


		
	}

	

