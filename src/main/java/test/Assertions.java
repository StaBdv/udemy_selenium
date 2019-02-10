package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assertions {

    public static void main(String[] args) {

        // WebDriver definition
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // Open URL
        driver.get("http://spicejet.com");
        driver.manage().window().maximize();

        // Resources
        WebElement checkboxSenior = driver.findElementByCssSelector("input[id*='SeniorCitizenDiscount']");

        // Asserts
        Assert.assertFalse(checkboxSenior.isSelected());

        // Set check box and check result
        checkboxSenior.click();
        Assert.assertTrue(checkboxSenior.isSelected());

    }

}
