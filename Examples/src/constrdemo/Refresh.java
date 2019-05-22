package constrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Refresh {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium by rameshspft");
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(5000);
		
		//driver.navigate().refresh();
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.F5).build().perform();
		

	}

}
