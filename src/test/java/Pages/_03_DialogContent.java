package Pages;

import Utilities.GWD;
import io.cucumber.java.ja.且つ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _03_DialogContent extends ParentPage {

    public _03_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line

    @FindBy(xpath = "(//*[@class='action switch'])[1]")
    public WebElement actionbutton;

    @FindBy(xpath = "(//*[text()='My Account'])[1]")
    public WebElement myaccount;

    @FindBy(xpath = "//*[text()='Manage Addresses']")
    public WebElement manageaddress;

    @FindBy(xpath = "//*[text()='Add New Address']")
    public WebElement addnewaddress;

    @FindBy(id = "telephone")
    public WebElement phone;

    @FindBy(id = "street_1")
    public WebElement street;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "region_id")
    public WebElement region;

    @FindBy(xpath = "(//*[text()='Georgia'])[1]")
    public WebElement georgia;

    @FindBy(xpath = "//*[@name='postcode']")
    public WebElement postcode;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "(//*[text()='Georgia'])[2]")
    public WebElement getGeorgia;

    @FindBy(xpath = "//*[text()='Save Address']")
    public WebElement save;

    @FindBy(xpath = "//*[text()='You saved the address.']")
    public WebElement successmessage;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "actionbutton":
                return this.actionbutton;
            case "myaccount":
                return this.myaccount;
            case "manageaddress":
                return this.manageaddress;
            case "addnewaddress":
                return this.addnewaddress;
            case "region":
                return this.region;
            case "georgia":
                return this.georgia;
            case "country":
                return this.country;
            case "getGeorgia":
                return this.getGeorgia;
            case "save":
                return this.save;
            case "phone":
                return this.phone;
            case "street":
                return this.street;
            case "city":
                return this.city;
            case "postcode":
                return this.postcode;

        }
        return null;
    }
    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.successmessage.isDisplayed());
    }

}

