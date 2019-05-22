package constrdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
        WebDriver f=new ChromeDriver();
        f.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        f.get("https://www.flipkart.com/"); 
        Actions action = new Actions(f);
        action.sendKeys(Keys.ESCAPE).build().perform();
        f.manage().window().maximize();
        f.manage().deleteAllCookies();
        
      
WebElement ele=f.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"));
        
       
        action.moveToElement(ele).build().perform();
        
       
        f.findElement(By.xpath("//a[@title='Outdoor Toys']")).click();
        
       WebElement DD =f.findElement(By.xpath("//div[@class='_1qKb_B']/select"));
       DD.click();
        Select s=new Select(DD);
        s.selectByValue("500");
        
        WebElement DD2 =f.findElement(By.xpath("//div[@class='_1YoBfV']/select"));
        
         Select s1=new Select(DD2);
         s1.selectByValue("1000");
        
        
        
        
        
        
        

	}

}
