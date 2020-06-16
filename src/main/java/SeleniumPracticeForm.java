import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumPracticeForm {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Subham");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Choudhary");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-1")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12-04-1994");
        driver.findElement(By.xpath("//*[@id=\"profession-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
        driver.findElement(By.id("tool-0")).click();
        driver.findElement(By.id("tool-2")).click();
        WebElement dropDown = driver.findElement(By.id("continents"));
        Select select1 = new Select(dropDown);
        select1.selectByIndex(2);
        WebElement list1 = driver.findElement(By.id("selenium_commands"));
        Select select = new Select(list1);
         select.selectByIndex(2);
        driver.findElement(By.id("submit")).click();

    }
}
