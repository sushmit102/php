package tra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tour {
	
	WebDriver driver;
	Properties prop;
	
	public Tour(WebDriver driver) {
		this.driver= driver;
	}
	
	By tourbtn=By.xpath("//a[contains(text(),'Tours')]");
	By toursearch=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	By tour=By.xpath("//div[@id='select2-drop']//input[contains(@class,'select2-input')]");
	By tourselect=By.xpath("//div[@id='select2-drop']//li[3]//div[1]");
	By tourtype=By.xpath("//span[contains(text(),'Select')]");
	By typeselect=By.xpath("By tourtype=By.xpath(\"//span[contains(text(),'Select')]\");");
	By tourchoosen=By.xpath("//div[@id='tourtype_chosen']//input[contains(@class,'chosen-search-input')]");
	//By tourtext=By.xpath("//div[contains(@class,'col-12 col-lg-12 col-xl-12')]");
	public void Toursearch() throws IOException {
    	prop=new Properties();
    	FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
		prop.load(fis);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(tourbtn).click();
		driver.findElement(toursearch).click();
		driver.findElement( tour).sendKeys("she");
		driver.findElement( tourselect).click();
		driver.findElement( typeselect).click();
		//driver.findElement(tourchoosen).click();
		driver.findElement(tourchoosen).sendKeys("private");
		//driver.findElement(tourtext).click();
}
}