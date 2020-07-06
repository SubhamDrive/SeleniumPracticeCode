import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TechlisticMenuItems {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //driver.findElement(By.linkText("Java")).click();
        driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[9]/a")).click();
        String javaTitle = driver.getTitle();
        System.out.println(javaTitle);
        driver.navigate().back();
        //driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[2]/a")).click();
        String seleniumTitle = driver.getTitle();
        System.out.println(seleniumTitle);
        driver.navigate().back();
        //driver.findElement(By.linkText("TestNG")).click();
        driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[7]/a")).click();
        String testngTitle = driver.getTitle();
        System.out.println(testngTitle);
        driver.navigate().back();
        driver.close();
    }
}
