package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {


    public static void main(String[] args) {


        // WebDriver definition
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // open URL
        driver.get("http://tizag.com/javascriptT/javascriptalert.php");
        driver.manage().window().maximize();

        // resources definition
        WebElement alertButton = driver.findElementByXPath("//input[contains(@value, 'Alert')]");

        // actions
        alertButton.click();

        // non HTML pop up (Java)
        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().sendKeys("text");
        driver.switchTo().alert().accept(); // accept = ok done yes
        //driver.switchTo().alert().dismiss();


    }
}