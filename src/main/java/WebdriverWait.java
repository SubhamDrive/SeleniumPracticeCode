import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverWait {


    public static void main(String s[])
    {
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        driver.findElement(By.id("alert")).click();
        System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
        WebdriverWait wait = new WebdriverWait(driver,10);
        Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Either Pop Up is displayed or it is Timed Out");
        myalert.accept();
        System.out.println("Alert Accepted");
        driver.close();
    }
}
