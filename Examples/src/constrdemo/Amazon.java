package constrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
        WebDriver f=new ChromeDriver();
        f.get("https://www.amazon.in/");
        WebElement el=f.findElement(By.xpath("//span[contains(text(),'Category')]"));
        
        Actions actions=new Actions(f);
        actions.moveToElement(el).build().perform();
        String text=el.getText();
        System.out.println(text);

	}

}
