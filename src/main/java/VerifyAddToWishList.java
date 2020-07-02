import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class VerifyAddToWishList {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        WebElement shirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        WebElement firstImage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        WebElement addtowishlist = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[3]/div[1]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(women).moveToElement(shirt).click().perform();
        action.moveToElement(firstImage).moveToElement(addtowishlist).click().perform();
        String error1= driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/div/div/p")).getText();
        if(error1.equalsIgnoreCase("You must be logged in to manage your wishlist."))
        {
            System.out.println("You Need To Login First To add it in wish list");
        }
        else
        {
            System.out.println("Added item in wish list");
        }
        System.out.println("Done");
    }
}
