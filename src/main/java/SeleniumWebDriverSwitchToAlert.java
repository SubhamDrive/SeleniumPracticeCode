import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumWebDriverSwitchToAlert {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
        driver.manage().window().maximize();

        //Handling Simple Alert
        driver.findElement(By.id("alert")).click();
        Alert myalert = driver.switchTo().alert();
        String text = myalert.getText();
        System.out.println(text);
        myalert.accept();


        //Handling Confirmation alert
       /* Alert confirmationAlert = driver.switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println("Alert text is " + alertText);
        confirmationAlert.dismiss();

        //Handling Prompt Alert
        Alert promptAlert  = driver.switchTo().alert();
        String alertText = promptAlert .getText();
        System.out.println("Alert text is " + alertText);
        //Send some text to the alert
         promptAlert .sendKeys("Accepting the alert");
        Thread.sleep(4000); //This sleep is not necessary, just for demonstration
        promptAlert .accept();

        */

    }
}

