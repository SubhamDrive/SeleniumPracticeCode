import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChangeBookingStatus {

    @BeforeMethod
    public void beforeClass()
    {
        System.out.println("HEy There i am groot");
    }

    @Test
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        //driver.findElement(By.linkText("Bookings")).click();
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("I run After method");
    }
}
