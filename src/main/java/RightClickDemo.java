import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickDemo {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/tooltip-and-double-click/");
        driver.manage().window().maximize();

        //Initatite Action Class
        Actions actions = new Actions(driver);

        WebElement btn = driver.findElement(By.id("rightClickBtn"));

        //Right Click the button to display Context Menu&nbsp;
        actions.contextClick(btn).perform();

        //Following code is to select item from context menu which gets open up on right click, this differs
        //depending upon your application specific test case:
        //Select and click 'Copy me' i.e. 2nd option in Context menu
        WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));
        elementOpen.click();

        //Accept the alert
        driver.switchTo().alert().accept();


    }
}
