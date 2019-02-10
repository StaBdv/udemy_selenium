package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

    public static void main(String[] args) throws InterruptedException {

        // set path property
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");

        // object creation
        WebDriver driver = new ChromeDriver();

        // open URL
        driver.get("http://makemytrip.com/");

/*
        //select static list "Currency"
        Select s = new Select(((ChromeDriver) driver).findElementById("ctl00_mainContent_DropDownListCurrency"));
        s.selectByVisibleText("AED");

        //select "Passengers"
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        //add "Adults"
        for(int i=1;i<9;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        //get text
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //Done
        driver.findElement(By.id("btnclosepaxoption")).click();


        //++dynamic drop down++
        //departure select
        ((ChromeDriver) driver).findElementByXPath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']").click();
        ((ChromeDriver) driver).findElementByXPath("//*[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']").click();

        Thread.sleep(2000);

        //destination select
        ((ChromeDriver) driver).findElementByXPath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']").click();
*/

        //source select
        WebElement source = ((ChromeDriver) driver).findElementByXPath("//input[@id='hp-widget__sfrom']");
        source.clear();
        source.sendKeys("mum");
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER);
        //destination select
        WebElement destination = ((ChromeDriver) driver).findElementById("hp-widget__sTo");
        destination.clear();
        destination.sendKeys("del");
        Thread.sleep(2000);

        for (int i = 1; i < 4; i++) {
            destination.sendKeys(Keys.ARROW_DOWN);
        }

        destination.sendKeys(Keys.ENTER);

    }


}
