package test.exercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exercise1 {

    public static void main(String[] args) {

        // WebDriver definition
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // Open URL
        driver.get("http://qaclickacademy.com/practice.php");

        // Task 1
        // Check the check box and check a result
        driver.findElementByCssSelector("input[id='checkBoxOption1']").click();
        Assert.assertTrue(driver.findElementByCssSelector("input[id='checkBoxOption1']").isSelected());
        // Uncheck the check box and check a result
        driver.findElementByCssSelector("input[id='checkBoxOption1']").click();
        Assert.assertFalse(driver.findElementByCssSelector("input[id='checkBoxOption1']").isSelected());

        // Task 2
        int count = driver.findElementsByCssSelector("input[id^='checkBoxOption']").size();
        Assert.assertEquals(count, 3);


    }
}
