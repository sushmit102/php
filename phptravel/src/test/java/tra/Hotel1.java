package tra;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Hotel1 {
		
		WebDriver driver;
		Properties prop;
		
		public Hotel1(WebDriver driver) {
			this.driver= driver;
		}
		
		By Cookie = By.cssSelector("button[id='cookyGotItBtn']");
		By hotelbtn=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]");
		By hotelsname=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");

		By hotelselect = By.xpath("//div[contains(text(),'chester, United Kingdom')]");
		By checkin=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[2]/div[1]/input[1]");
		By checkout=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[3]/div[1]/input[1]");
		By Noofpassengers=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[4]/div[1]/input[1]");
		By adultbtn=By.xpath("//input[@id='hadultInput']");
		By child=By.xpath("//input[@id='hchildInput']");

		By searchbtn=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[5]/button[1]");


	    public void Hotelsearch() throws IOException {
	    	prop=new Properties();
	    	FileInputStream fis=new FileInputStream("C:\\New folder\\phptravel\\src\\main\\java\\travel\\data.properties");
			prop.load(fis);
			driver.findElement(Cookie).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//hotel name
			driver.findElement(hotelbtn).click();
			driver.findElement(hotelsname).click();
			driver.findElement(hotelsname).sendKeys(prop.getProperty("hotelsname"));
			driver.findElement(hotelselect).click();
			
		
			//Check in
			driver.findElement(checkin).click();
			int count= driver.findElements(By.className("day")).size();
			for(int i=0;i<count;i++)
			{
				String text1 = driver.findElements(By.className("day")).get(i).getText();
				if(text1.equalsIgnoreCase("12"))
				{
					driver.findElements(By.className("day")).get(i).click();
				}
			}
			
			
			//Check out
			driver.findElement(checkout).click();
			int count1= driver.findElements(By.className("day ")).size();
			for(int i=0;i<count1;i++)
			{
				String text1 = driver.findElements(By.className("day ")).get(i).getText();
				if(text1.equalsIgnoreCase("13"))
				{
					driver.findElements(By.className("day ")).get(i).click();
				}
			}
			
			driver.findElement(Noofpassengers).click();
			driver.findElement(adultbtn).clear();
			driver.findElement(adultbtn).sendKeys("3");
			
			driver.findElement(child).clear();
			driver.findElement(child).sendKeys("1");
			
			driver.findElement(searchbtn).click();
			
	    }
	}



