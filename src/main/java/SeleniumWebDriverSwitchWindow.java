import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWebDriverSwitchWindow {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-switch-windows-2/");

        String handle = driver.getWindowHandle();
        System.out.println(handle);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/button[2]")).click();

        Set handles = driver.getWindowHandles();
        System.out.println(handles);

        for (String handle1 : driver.getWindowHandles())
        {
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }
    }
}
