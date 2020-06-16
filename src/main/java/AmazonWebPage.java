import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonWebPage {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        String MainPageTitle = driver.getTitle();
        System.out.println(MainPageTitle);
        driver.findElement(By.linkText("Amazon Pay")).click();
        String AmazonPay =  driver.getTitle();
        System.out.println(AmazonPay);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.navigate().back();
        String MainPageTitle1 = driver.getTitle();
        System.out.println(MainPageTitle1);
        Boolean Ans = MainPageTitle.equals(MainPageTitle1);
        if(Ans.equals(true))
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Hard Luck");
        }
        driver.close();

    }
}
