package tra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Signup {
	
	WebDriver driver;
	Properties  prop;
	
	public Signup(WebDriver driver) {
		this.driver= driver;
	}
	By Myaccount=By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By Singnup=By.xpath("//a[@class='dropdown-item tr']");
	By Firstname=By.xpath("//input[@placeholder='First Name']");
	By Lastname=By.xpath("//input[@placeholder='Last Name']");
	By Mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
	By Email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By Confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	
	By Signup=By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
	//By cookie=By.xpath("//button[@class='cc-btn cc-dismiss']");
	
	public void Registrationpage() throws IOException, InterruptedException {
		prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\git\\Test\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		driver.findElement( Myaccount).click();
		driver.findElement( Singnup).click();
		driver.findElement(Firstname).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(Lastname).sendKeys(prop.getProperty("LastName"));
		driver.findElement(Mobilenumber).sendKeys(prop.getProperty("Mobilenumber"));
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Password).sendKeys(prop.getProperty("Password"));
		driver.findElement(Confirmpassword).sendKeys(prop.getProperty("Confirmpassword"));
		Thread.sleep(2000);
		driver.findElement(Signup).sendKeys(Keys.ENTER);
		
		//driver.findElement(cookie).click();
		
	}
	
	

}
