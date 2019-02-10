package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {


    public static void main(String[] args) {


        // set path property
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");

        // object creation
        WebDriver driver = new ChromeDriver();

        // open URL
        driver.get("http://facebook.com");
        // print site details
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());

        // actions
        /*((ChromeDriver) driver).findElementByCssSelector("[title*='Sign in']").click();
        ((ChromeDriver) driver).findElementByXPath("//input[contains(@id,'login')]").sendKeys("my_email_address");
        ((ChromeDriver) driver).findElementByXPath("//input[contains(@id,'password')]").sendKeys("my_password");
        ((ChromeDriver) driver).findElementByCssSelector("[title*='Sign in']").click();
        */
        ((ChromeDriver) driver).findElementByXPath("//input[contains(@value,'Log In')]").click();


    }

}
