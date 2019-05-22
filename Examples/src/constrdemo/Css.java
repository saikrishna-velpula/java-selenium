package constrdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\java-selenium\\\\java-selenium\\\\Drivers\\\\chromedriver_win32_chr74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/track-order/19L74O");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("*#^Swiggy_Filled")).click();
		driver.findElement(By.cssSelector("a._3iFC5")).click();
		
		

	}

}
