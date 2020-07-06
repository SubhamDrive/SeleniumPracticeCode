import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scrolling {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //1>Scroll By Pixel
        //js.executeScript("window.scrollBy(0,1000)","");


        //2>Scroll By Find Element
        //WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
        //js.executeScript("arguments[0].scrollIntoView();",flag);

        //3>Scroll upto endof the page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
}
