import jdk.incubator.jpackage.internal.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenShot {

    private static IOUtils FileUtils;

    public static void main(String s[]) throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.get("https://www.toolsqa.com/selenium-tutorial/");
        driver.manage().window().maximize();
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("/Users/driveu/Desktop"));
        }
        catch(Exception e)
        {
            System.out.println("Error in loading the Google page");
        }


    }
}
