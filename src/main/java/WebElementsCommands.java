import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebElementsCommands {
    public static  void main(String s[])
    {

        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).clear();
        boolean dis = driver.findElement(By.name("firstname")).isDisplayed();
        System.out.println(dis);
        boolean enb = driver.findElement(By.name("firstname")).isEnabled();
        System.out.println(enb);
        boolean sel = driver.findElement(By.name("firstname")).isSelected();
        System.out.println(sel);
        driver.findElement(By.name("firstname")).sendKeys("Subham");

        boolean ldis = driver.findElement(By.id("lastname")).isDisplayed();
        System.out.println(ldis);
        boolean lenb = driver.findElement(By.id("lastname")).isEnabled();
        System.out.println(lenb);
        boolean lsel = driver.findElement(By.id("lastname")).isSelected();
        System.out.println(lsel);
        driver.findElement(By.id("lastname")).sendKeys("Choudhary");
        driver.findElement(By.id("buttonwithclass")).submit();

        String txt =driver.findElement(By.xpath(".//*[@id=\"content\"]/div[2]/div/form/fieldset/div[2]/a/strong")).getText();
        System.out.println(txt);


    }
}
