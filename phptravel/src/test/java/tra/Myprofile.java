package tra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	
	Actions a=new Actions(driver);
	By profile=By.xpath("//div[@id='body-section']//li[2]//a[1]");
	//By wishlist=By.xpath("//div[@id='body-section']//li[3]//a[1]");
	//By fname=By.xpath("//input[@placeholder='First Name']");
	By adress=By.xpath("//input[@placeholder='Address']");
	By city=By.xpath("//input[@placeholder='City']");
	By state=By.xpath("//input[@placeholder='State/Region']");
	By Postalcode=By.xpath("//input[@placeholder='Postal/Zip Code']");
	By country=By.xpath("//select[@name='country']");
	By submitbtn=By.xpath("//button[@class='btn btn-action btn-block updateprofile']");
	
	
	
	public void profileaccount() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		
		//driver.findElement(wishlist).click();
		WebElement move= driver.findElement(profile);
		a.moveToElement(move).build().perform();
		driver.findElement(adress).sendKeys(prop.getProperty("adress"));
		driver.findElement(city).sendKeys(prop.getProperty("city"));
		driver.findElement(state).sendKeys(prop.getProperty("state"));
		driver.findElement(Postalcode).sendKeys(prop.getProperty("Postalcode"));
		driver.findElement(country).sendKeys(prop.getProperty("country"));
		driver.findElement(country).sendKeys(Keys.DOWN);
		driver.findElement(country).getText();
		driver.findElement(submitbtn).click();
		
		
	}

}
