package MindTree.Assessment;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * Hello world!
 *
 */
public class App {
	//Book Car to go to Airport
    public static void main( String[] args ) throws InterruptedException{
        String driver = "webdriver.edge.driver";
        String driverLocation = "C:\\Users\\M1077580\\Downloads\\msedgedriver.exe";
        System.setProperty(driver, driverLocation);
        
        WebDriver edgeDriver = new EdgeDriver();
        
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://www.savaari.com/");
        
        edgeDriver.findElement(By.cssSelector(".bg-airport")).click();

        edgeDriver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
        Thread.sleep(1000);
        edgeDriver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).click();
        edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ARROW_DOWN);
        edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ARROW_DOWN);
        edgeDriver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ENTER);  
        edgeDriver.findElement(By.id("search_places")).click();
        Thread.sleep(200);
        edgeDriver.findElement(By.id("search_places")).sendKeys("Banashankari");
        Thread.sleep(1000);
        edgeDriver.findElement(By.cssSelector(".book-button.btn")).click();
        Thread.sleep(1000);
        edgeDriver.findElement(By.id("search_places")).click();
        Thread.sleep(1000);
        edgeDriver.findElement(By.id("search_places")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        edgeDriver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
        Thread.sleep(500);
        edgeDriver.findElement(By.cssSelector(".book-button.btn")).click();
    }
}
