package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        // set path property
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");

        // object creation
        WebDriver driver = new ChromeDriver();

        // open URL
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());
        // driver.navigate().back();

        // login

        ((ChromeDriver) driver).findElementByXPath("//*[@id='email']").sendKeys("fake@email.com");

        ((ChromeDriver) driver).findElementByXPath("//*[@id='passwd']").sendKeys("fake_password");
        ((ChromeDriver) driver).findElementByXPath("//*[@id='SubmitLogin']").click();


        System.out.println(((ChromeDriver) driver).findElementByCssSelector("#center_column > div.alert.alert-danger").getText());


        //driver.close();


    }
}
