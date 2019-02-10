package test.exercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;


public class Exercise2 {

    public static void main(String[] args) throws InterruptedException {

        // WebDriver definition
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://cleartrip.com");

        // Select adults
        Select s = new Select(driver.findElementById("Adults"));
        s.selectByVisibleText("5");

        // Select current date
        driver.findElementByXPath("//i[contains(@class,'datePicker')]").click();
        driver.findElementByXPath("//a[contains(@class,'ui-state-active')]").click();

        // Add more options
        driver.findElementByXPath("//*[@id='MoreOptionsLink']").click();

        // Select class of travel
        Select c = new Select(driver.findElementById("Class"));
        c.selectByVisibleText("Business");

        // Select preferred airline
        driver.findElementByXPath("//*[@id='AirlineAutocomplete']").sendKeys("aerof");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id='AirlineAutocomplete']").sendKeys(Keys.ENTER);

        // Click search button
        driver.findElementByXPath("//*[@id='SearchBtn']").click();

        // Print error message
        System.out.println("Error message appeared: '" + driver.findElementByXPath("//*[@id='homeErrorMessage']").getText() + "'");


    }

}
