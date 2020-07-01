import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegisterForm {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Subham");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Choudhary");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Bangalore,Karnataka");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Choudharysubham47@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7348808740");
        driver.findElement(By.name("radiooptions")).click();
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox3")).click();

        /*Select for Langugage
        WebElement wb = driver.findElement(By.id("msdd"));
        wb.click();
        Select select = new Select(wb);
        System.out.println(select);
        select.selectByVisibleText("English");*/

        //Select For Skills
        WebElement wb1 = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
        Select s1 = new Select(wb1);
        s1.selectByVisibleText("C++");


        //Select For Country
        WebElement wb2 = driver.findElement(By.id("countries"));
        Select s2 = new Select(wb2);
        s2.selectByVisibleText("India");

        //Select For Country
        WebElement wb3 = driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"));
        Select s3 = new Select(wb3);
        s3.selectByVisibleText("India");

        //Select For YearBox
        WebElement wb4 = driver.findElement(By.id("yearbox"));
        Select s4 = new Select(wb4);
        s4.selectByVisibleText("1994");

        //Select For Month
        WebElement wb5 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        Select s5 = new Select(wb5);
        s5.selectByVisibleText("April");

        //Select For Day
        WebElement wb6 = driver.findElement(By.id("daybox"));
        Select s6 = new Select(wb6);
        s6.selectByVisibleText("12");

        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Subham123456");
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Subham123456");

        driver.findElement(By.id("submitbtn")).click();
    }
}
