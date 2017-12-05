package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_LoggedIn {


    //zipcode field
    @FindBy(how = How.ID, using = "homepageFap_Input")
    public WebElement txtZipcode;

    //find a dog btn
    @FindBy(how = How.CSS, using = ".fapMenu-inner-section-field fapMenu-inner-section-field_btn u-isHidden@maxLg")
    public WebElement btnFindADog;

    //click breed drop down list
    @FindBy(how = How.ID, using = "breed-autosuggest_List_Box_Btn")
    public WebElement btnAnyBreed;

    //bread search input field
    @FindBy(how = How.ID, using = "breed-autosuggest_SearchInput")
    public WebElement txtBreedSearch;

    //select american bulldog
    @FindBy(how = How.ID, using = "homepageFap_Input")
    public WebElement btnAmericanBullDog;


    public void UserShouldBeAbleToFindABullDogByZipCode(String zipcode, String breed) {


        txtZipcode.sendKeys(zipcode);
        btnFindADog


    }


}
