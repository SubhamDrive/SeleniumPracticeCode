import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();

        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        //Here, getting x and y offset to drop source object on target object location
        //First, get x and y offset for from object
        int xOffset1 = from.getLocation().getX();

        int yOffset1 =  from.getLocation().getY();

        System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);

        //Secondly, get x and y offset for to object
        int xOffset = to.getLocation().getX();

        int yOffset =  to.getLocation().getY();

        System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);

        //Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
        xOffset =(xOffset-xOffset1)+10;
        yOffset=(yOffset-yOffset1)+20;


        //Perform dragAndDropBy
        builder.dragAndDropBy(from, xOffset,yOffset).perform();

        //verify text changed in to 'Drop here' box
        //Get text value of 'to' element
        String textTo = to.getText();

        if(textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped at location as expected");
        }else {
            System.out.println("FAIL: Source couldn't be dropped at location as expected");
        }

        driver.close();

    }
}
