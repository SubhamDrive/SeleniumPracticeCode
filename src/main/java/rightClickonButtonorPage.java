import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class rightClickonButtonorPage {
    public static void main(String s[]) {
        System.setProperty("webdriver.chrome.driver", "/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/p/span"));
        action.contextClick(button).build().perform();
        driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();
        driver.close();
    }
}
