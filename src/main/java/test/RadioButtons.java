package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/StaBdv/Webdriver/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();

        //open URL
        driver.get("http://echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();


        //radio button handling

        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

        for (int i = 0; i < count; i++) {
            String text = driver.findElementsByXPath("//input[@name='group1']").get(i).getAttribute("value");
            if (text.equals("Cheese")) {
                driver.findElementsByXPath("//input[@name='group1']").get(i).click();
            }
        }

    }
}
