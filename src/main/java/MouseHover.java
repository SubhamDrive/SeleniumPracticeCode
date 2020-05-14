import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHover {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.get("http://demoqa.com/menu/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Music' from Menu");

        WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]"));
        actions.moveToElement(subMenuOption).perform();
        System.out.println("Done Mouse hover on 'Rock' from Menu");

        WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
        selectMenuOption.click();
        System.out.println("Selected 'Alternative' from Menu");
    }
}
