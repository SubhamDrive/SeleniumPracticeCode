import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindow {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String parentWindowHandle = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
        driver.manage().window().maximize();
        WebElement but = driver.findElement(By.id("button1"));
        for(int i=1;i<=3;i++)
        {
                but.click();
        }
        Set<String> allWindowsHandles = driver.getWindowHandles();
        String lastWindowHandle = "";
        for(String handle: allWindowsHandles)
        {
            System.out.println(handle);
            driver.switchTo().window(handle);
            driver.get("http://google.com");
            lastWindowHandle = handle;
        }
        driver.switchTo().window(parentWindowHandle);
        driver.close();
        driver.switchTo().window(lastWindowHandle);


    }
}
