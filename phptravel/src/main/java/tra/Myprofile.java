package tra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.data.repository.query.QueryLookupStrategy.Key;

import ch.qos.logback.core.joran.action.Action;

public class Myprofile {
	
	WebDriver driver;
	Properties prop;
	
	public Myprofile(WebDriver driver) {
		this.driver= driver;
	}
	
	By profile=By.xpath("//a[contains(text(),'My Profile')]");
	By password=By.xpath("//input[@placeholder='Password']");
	By conpassword=By.xpath("//input[@placeholder='Confirm Password']");
	By adress=By.xpath("//input[@placeholder='Address']");
	By city=By.xpath("//input[@placeholder='City']");
	By state=By.xpath("//input[@placeholder='State/Region']");
	By Postalcode=By.xpath("//input[@placeholder='Postal/Zip Code']");
	By country=By.xpath("//span[contains(text(),'Select Country')]");
	By country1=By.xpath("//input[@class='chosen-search-input']");
	//By submitbtn=By.xpath("//button[@class='btn btn-action btn-block updateprofile']");
	
	
	public void profileaccount() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(profile).click();
		driver.findElement( password).sendKeys("abcdef");
		driver.findElement(conpassword).sendKeys("abcdef");
	driver.findElement(adress).sendKeys("Rajajinagar");
		driver.findElement(city).sendKeys("Bangalore");
		driver.findElement(state).sendKeys("Karnataka");
		driver.findElement(Postalcode).sendKeys("560010");
		driver.findElement(country).click();
		driver.findElement(country1).sendKeys("china");
		driver.findElement(country1).sendKeys(Keys.ENTER);
	
		//driver.findElement(submitbtn).click();
		
		
	}

}
