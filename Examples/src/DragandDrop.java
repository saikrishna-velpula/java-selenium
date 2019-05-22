import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTMLLUAdminUser\\Desktop\\Selenium stuff\\chromedriver_win32_chr74\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Draggable")).click();
        TargetLocator targetlocator=driver.switchTo();
        targetlocator.frame(0);
        WebElement ele=driver.findElement(By.id("draggable"));
        Actions actions=new Actions(driver);
       actions.dragAndDropBy(ele, 150, 150).build().perform();
       targetlocator.defaultContent();
       driver.findElement(By.id("droppable"));*/
       Thread.sleep(5000);
       targetlocator.frame(0);
       WebElement source=driver.findElement(By.id("draggable"));
       WebElement target=driver.findElement(By.id("droppable"));
       actions.dragAndDrop(source, target).build().perform();
       

	}

}
