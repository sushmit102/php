package tra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Base {

	public WebDriver driver;
	public Properties prop;
	
	
	@Test
	public void Myaccount() throws IOException {
		prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 
		}
		
		
		//String browsername=prop.getProperty("browser");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]")).click();
		
		Signup reg=new Signup(driver);
		reg.Registrationpage();
		
		//Loginpage log=new Loginpage(driver);
		//log.Login();
		 
		//Hotel1 hot=new Hotel1(driver);
		//hot.Hotelsearch();
		
		//Flight fli=new Flight(driver);
		//fli.Flightsearch();
		
		//Myprofile prof=new Myprofile();
		//prof.profileaccount();
	}
	
		
	}
	

