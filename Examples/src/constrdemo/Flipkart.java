package constrdemo;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
        WebDriver f=new ChromeDriver();
        f.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        f.get("https://www.flipkart.com/");
        Actions action = new Actions(f);
        action.sendKeys(Keys.ESCAPE).build().perform();
        f.manage().window().maximize();
        WebElement ele=f.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
        
       
        action.moveToElement(ele).build().perform();
        WebElement mobile=f.findElement(By.linkText("Mobile Accessories"));
        mobile.click();
        Thread.sleep(3000);
        WebElement dd=f.findElement(By.xpath("//div[@class='_1qKb_B']/select"));
        dd.click();
        Select s=new Select(dd);
        s.selectByValue("200");
        Thread.sleep(3000);
        WebElement max=f.findElement(By.xpath("//div[@class='_1YoBfV']/select"));
        max.click();
        Thread.sleep(3000);
        Select n=new Select(max);
        n.selectByValue("500");
        Thread.sleep(3000);
        f.findElement(By.xpath("//*[starts-with(text(),'Motorola Moto G5 Pl')]")).click();
        
        
        
        
        
        

	}

}
