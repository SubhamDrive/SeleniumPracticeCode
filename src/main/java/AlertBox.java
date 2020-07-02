
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertBox {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul/li[1]/a")).click();

        //ALERT WITH OK BUTTON
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();

        //Alert WITH Ok and cancel button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        driver.switchTo().alert().accept();
        String okButton = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
        if(okButton.equalsIgnoreCase("You pressed Ok"))
        {
            System.out.println("You pressed Ok");
        }
        else
        {
            System.out.println("You did not pressed Ok button");
        }

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        driver.switchTo().alert().dismiss();
        String disButton = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
        if(disButton.equalsIgnoreCase("You Pressed Cancel"))
        {
            System.out.println("You pressed Dismiss");
        }
        else
        {
            System.out.println("You did not pressed Dismiss button");
        }

        //Entered Name Successfully
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        driver.switchTo().alert().sendKeys("Subham Choudhary");
        driver.switchTo().alert().accept();
        String msg=driver.findElement(By.id("demo1")).getText();
        System.out.println(msg);
        if(msg.equalsIgnoreCase("Hello Subham Choudhary How are you today"))
        {
            System.out.println("Name Entered Successfully");
        }
        else
        {
            System.out.println("Better Luck Next Time");
        }

        driver.close();
    }
}
