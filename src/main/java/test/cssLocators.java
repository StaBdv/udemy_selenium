package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class cssLocators {

    public static void main(String[] args) {

        // set WebDriver
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // open URL
        driver.get("http://login.salesforce.com");

        //actions
        driver.findElementByCssSelector("input[name='username']").sendKeys("Username");
        driver.findElementByCssSelector("input[name='pw']").sendKeys("password");
        driver.findElementByCssSelector("input[name='Login']").click();
        Assert.assertEquals(driver.findElementByCssSelector("div#error").getText(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
        //System.out.println("Error presented: "+driver.findElementByCssSelector("div#error").getText());


    }

}
