package Selenium_Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.HomePage;
import pages.HomePage_LoggedIn;

public class LoginTest {


    //global driver
    private WebDriver _driver = null;


    @Before
    public void initialize() {


        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/KKUdemyFrameWork2/src/com/ssi/framework/Drivers/chromedriver");
        _driver = new ChromeDriver();

        _driver.get("http://petfinder.com");


    }

    @Test
    public void Login() {

        HomePage page = new HomePage(_driver);
        HomePage_LoggedIn page2 = new HomePage_LoggedIn();

        page.loginToPetFinder("samisabir212@gmail.com", "Apples212");
        page2.UserShouldBeAbleToFindABullDogByZipCode("22042", " American Bulldog");




    }

    @After
    public void endtest() {

        _driver.quit();


    }






}
