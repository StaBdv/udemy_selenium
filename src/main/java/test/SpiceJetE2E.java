package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//TestNG is used for assertion

public class SpiceJetE2E {

    public static void main(String[] args) throws InterruptedException {

        // WebDriver definition
        System.setProperty("webdriver.chrome.driver", "/Users/StaBdv/Webdriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // Open URL
        driver.get("http://spicejet.com");
        driver.manage().window().maximize();

        // Resources
        WebElement checkboxSenior = driver.findElementByCssSelector("input[id*='SeniorCitizenDiscount']");
        WebElement checkboxFamily = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']"));
        WebElement addPassengerAdult = driver.findElement(By.id("hrefIncAdt"));
        WebElement passengersField = driver.findElement(By.id("divpaxinfo"));
        WebElement buttonDone = driver.findElement(By.id("btnclosepaxoption"));
        WebElement currency = driver.findElementById("ctl00_mainContent_DropDownListCurrency");
        WebElement source = driver.findElementById("ctl00_mainContent_ddl_originStation1_CTXT");
        WebElement destination = driver.findElementById("ctl00_mainContent_ddl_destinationStation1_CTXT");

        // Actions
        // Set check box and print result
        checkboxFamily.click();
        System.out.println("Check box is selected: " + checkboxFamily.isSelected());

        // Count the number of check boxes
        System.out.println("Total check boxes on the page: " + driver.findElementsByCssSelector("input[type='checkbox']").size());

        // Print names taken from the check boxes
        int count = driver.findElementsByCssSelector("input[type='checkbox']").size();
        for (int i = 0; i < count; i++) {
            System.out.println(i + " check box id is: " + driver.findElementsByCssSelector("input[type='checkbox']").get(i).getAttribute("name"));
        }

        //add "Adults"
        passengersField.click();

        Thread.sleep(2000L);

        for (int i = 1; i < 4; i++) {
            addPassengerAdult.click();
        }
        // Validate selected passengers
        System.out.println("Passengers selected: " + passengersField.getText());
        Assert.assertEquals(passengersField.getText(), "4 Adult");

        // Click done
        buttonDone.click();

        //select static list "Currency"
        Select s = new Select(currency);
        s.selectByVisibleText("AED");

        // Destination FROM select
        source.clear();
        source.sendKeys("DEL");
        Thread.sleep(2000);
        //source.sendKeys(Keys.ENTER);

        // Destination TO select
        destination.clear();
        destination.sendKeys("MAA");
        Thread.sleep(2000);

        // Select departure current date
        driver.findElementByCssSelector(".ui-state-default.ui-state-highlight.ui-state-active").click();
        // Select trip direction
        driver.findElementByCssSelector("#ctl00_mainContent_rbtnl_Trip_1").click();

        // Validate is date field enabled
        if (driver.findElementByCssSelector("#Div1").getAttribute("style").contains("1")) {

            System.out.println("It's enabled ");
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);
        }
        // Click "Search" button
        driver.findElementByXPath("//*[@id='ctl00_mainContent_btn_FindFlights']").click();


    }


}
