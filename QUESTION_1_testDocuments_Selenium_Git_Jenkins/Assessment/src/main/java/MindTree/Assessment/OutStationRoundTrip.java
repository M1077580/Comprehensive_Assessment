package MindTree.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OutStationRoundTrip {
    public static void main( String[] args ) throws InterruptedException{
        String driver = "webdriver.edge.driver";
        String driverLocation = "C:\\Users\\M1077580\\Downloads\\msedgedriver.exe";
        System.setProperty(driver, driverLocation);
        
        WebDriver edgeDriver = new EdgeDriver();
        
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://www.savaari.com/");
        String halfXpath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div";
        
        edgeDriver.findElement(By.xpath(halfXpath + "/div[2]/label")).click();
        
        edgeDriver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
        Thread.sleep(1000);
        edgeDriver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
        edgeDriver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys("Pune");
        Thread.sleep(1500);
        edgeDriver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys(Keys.ENTER);      
        edgeDriver.findElement(By.id("pickUpTime")).sendKeys(Keys.ENTER);
        edgeDriver.findElement(By.xpath(halfXpath + "/form/div[4]/div/button")).click();
    }

}
