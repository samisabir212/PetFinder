package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.CSS, using = ".header-inner-profile-btn")
    public WebElement btnSignInClick;

    @FindBy(how = How.ID, using = "Login_Modal_username")
    public WebElement txtUsername;

    @FindBy(how = How.ID, using = "Login_Modal_password")
    public WebElement txtPassword;


    @FindBy(how = How.XPATH, using = ".//button[@class='btn m-btn_loader m-btn_full u-vr6x']")
    public WebElement btnLoginClick;

    @FindBy(how = How.CSS, using = ".header-inner-profile-btn")
    public WebElement btnFindADog;




    public void loginToPetFinder(String username, String password) {

        btnSignInClick.click();
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLoginClick.click();

    }


}
