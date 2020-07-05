import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindBrokenLinks {
  public static void main(String s[]) throws IOException, InterruptedException {
      System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
      WebDriver driver = new ChromeDriver();
      //driver.get("https://www.driveu.in/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

      List <WebElement> links = driver.findElements(By.tagName("a"));
      int count = links.size();
      System.out.println(count);

      for(int i=0;i<count;i++)
      {
          WebElement element = links.get(i);
          String url = element.getAttribute("href");
          URL link = new URL(url);
          HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
          Thread.sleep(2000);
          httpconn.connect();
          int rescode = httpconn.getResponseCode();

          if(rescode>=400)
          {
              System.out.println(url+" "+"is broken");
          }
          else
          {
              System.out.println(url+"  "+"Valid Url");
          }

      }

  }

}
