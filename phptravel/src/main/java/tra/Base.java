package tra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;



public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public static org.apache.logging.log4j.Logger log;
	
	@BeforeSuite
	public void log() throws FileNotFoundException,IOException
	{
		String Logconfig="C:\\Users\\Online Test\\git\\Test\\phptravel\\resource\\log4j.xml";
        ConfigurationSource src=new ConfigurationSource(new FileInputStream(Logconfig));
        Configurator.initialize(null,src);
        log=LogManager.getLogger(Base.class.getName());
	}

	
	
	public WebDriver Myaccount() throws IOException, InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
		prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\git\\Test\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		

		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));	 
		
		return driver;
		
		
		
	}
	}
	
	
		
	
		


