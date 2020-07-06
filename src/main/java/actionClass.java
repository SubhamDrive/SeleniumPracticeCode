import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement admin= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
        WebElement  usermgm = driver.findElement(By.id("menu_admin_UserManagement"));
        WebElement  subMenu= driver.findElement(By.id("menu_admin_viewSystemUsers"));

        Actions act = new Actions(driver);
        /*act.moveToElement(admin).build().perform();
        act.moveToElement(usermgm).build().perform();
        act.moveToElement(subMenu).click().build().perform();*/

        act.moveToElement(admin).moveToElement(usermgm).moveToElement(subMenu).click().build().perform();
        Dimension rows = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr")).getSize();
        System.out.println(rows);
        System.out.println("Login Successful");
        driver.close();
    }
}
