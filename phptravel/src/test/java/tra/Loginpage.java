package tra;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	Properties  prop;
	
	public Loginpage(WebDriver driver) {
		this.driver= driver;
	}
    By Email=By.xpath("//input[@placeholder='Email']");
    By Lpassword=By.xpath("//input[@placeholder='Password']");
    By Cookie=By.xpath("//button[@id='cookyGotItBtn']");
    By login=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
    
    public void Login() throws IOException {
    	prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Lpassword).sendKeys(prop.getProperty("Lpassword"));
		driver.findElement(Cookie).click();
		driver.findElement(login).click();
		
    }
}
