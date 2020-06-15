import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoDaddy {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.godaddy.com/");
        System.out.println("First Test Case Pass->Launch GoDaddy WebSite");
        driver.manage().window().maximize();
        System.out.println("Second Test Case Pass->Maximize the website");

        String pageTilte = driver.getTitle();
        if (pageTilte=="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN") {
            System.out.println("Third Test Case Pass->Get Title Of The page"+pageTilte);
        }
        else {
            System.out.println("Third Test Case FAILED->Get Title Of The page");
        }
        String getUrl = driver.getCurrentUrl();
        System.out.println("Current Url Is "+getUrl);
        System.out.println("Fourth Test Case Passed -> GetCurrentUrl");
        //String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
        //System.out.println("Fifth Test Case Passed -> GetPageSource");
        driver.close();
    }
}
