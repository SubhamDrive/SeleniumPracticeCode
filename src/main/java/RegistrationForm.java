import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationForm {
    public static void main(String s[])
    {
        String EmailId = "subham@driveu.in";
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("[name='email_create']")).sendKeys(EmailId);
        driver.findElement(By.id("SubmitCreate")).click();
       // String msg = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();

        /*if(msg.equals("Invalid email address.")) {
            System.out.println("Invalid Email Id please enter valid emailid");
        }else if(msg.equalsIgnoreCase("An account using this email address has already been registered. Please enter a valid password or request a new one."))
        {
            System.out.println(EmailId +"This EmailId Is already Registered"); }
        else {
            System.out.println("Welcome You Are OnBoarded"); }*/

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.name("customer_firstname")).sendKeys("Subham");
        driver.findElement(By.name("customer_lastname")).sendKeys("Choudhary");
            driver.findElement(By.id("passwd")).sendKeys("Subham456");
        WebElement el = driver.findElement(By.id("days"));
        Select select = new Select(el);
        select.selectByIndex(12);

        WebElement el1 = driver.findElement(By.id("months"));
        Select select1 = new Select(el1);
        select1.selectByIndex(4);

        WebElement el2 = driver.findElement(By.id("years"));
        Select select2 = new Select(el2);
        select2.selectByIndex(27);

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();

        driver.findElement(By.id("firstname")).sendKeys("Test User");
        driver.findElement(By.id("lastname")).sendKeys("Vsoft");
        driver.findElement(By.id("company")).sendKeys("Vsoft");
        driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
        driver.findElement(By.id("city")).sendKeys("XYZ");
        WebElement statedropdown=driver.findElement(By.name("id_state"));
        Select oSelect=new Select(statedropdown);
        oSelect.selectByValue("4");

        driver.findElement(By.name("postcode")).sendKeys("51838");

        // Select Country
        WebElement countrydropDown=driver.findElement(By.name("id_country"));
        Select oSelectC=new Select(countrydropDown);
        oSelectC.selectByVisibleText("United States");

        //Enter Mobile Number
        driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
        driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
        driver.findElement(By.name("submitAccount")).click();
        String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();



    }
}
