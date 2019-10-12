package tra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Signup {
	
	WebDriver driver;
	Properties  prop;
	
	public Signup(WebDriver driver) {
		this.driver= driver;
	}
	By Firstname=By.xpath("//input[@placeholder='First Name']");
	By Lastname=By.xpath("//input[@placeholder='Last Name']");
	By Mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
	By Email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By Confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	By Cookie=By.xpath("//button[@id='cookyGotItBtn']");
	By Signup=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	
	public void Registrationpage() throws IOException {
		prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		driver.findElement(Firstname).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(Lastname).sendKeys(prop.getProperty("LastName"));
		driver.findElement(Mobilenumber).sendKeys(prop.getProperty("Mobilenumber"));
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Password).sendKeys(prop.getProperty("Password"));
		driver.findElement(Confirmpassword).sendKeys(prop.getProperty("Confirmpassword"));
		driver.findElement(Cookie).click();
		driver.findElement(Signup).click();
		
		
		
	}
	
	

}
