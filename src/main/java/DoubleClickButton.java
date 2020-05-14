import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DoubleClickButton {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/tooltip-and-double-click/");
        driver.manage().window().maximize();

        WebElement btn1 = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(btn1).perform();
        System.out.println("Double Clicked just happened");
        driver.switchTo().alert().accept();
        System.out.println("Double click alert happned");


    }
}
