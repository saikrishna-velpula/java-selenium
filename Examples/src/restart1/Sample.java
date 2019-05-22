package restart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
        WebDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.seleniumhq.org/");
		
		
	

	}

}
