package constrdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADPlinks {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.adp.in/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        List eles=driver.findElements(By.xpath("//*"));
        int links=0;
        int adpcount=0;
        for(Object ab: eles)
        {
          WebElement ele=(WebElement) ab;
          String actualTagname=ele.getTagName();
          if(actualTagname.equalsIgnoreCase("a"))
          {
        	  links++;
          }
          if(ele.getText()!=null)
          {
        	  if(ele.getText().contains("adp")||ele.getText().contains("ADP"))
        	  adpcount++;
          }
        }
           System.out.println("Total no of links:" +links);
           System.out.println("Total no of copycount:" +adpcount);
	}
}

