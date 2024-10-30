
package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _04_DialogContent extends ParentPage {

    public _04_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
//    public WebElement openNewAccount;
    @FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='action login primary']")
    public WebElement submit;

    @FindBy(xpath = "//a/span[text()='What's New']")
    public WebElement whatsNewButton;

    @FindBy(xpath = "//a/span[text()='Women']")
    public WebElement women;

    @FindBy(xpath = "//a/span[text()='Men']")
    public WebElement men;

    @FindBy(xpath = "//a/span[text()='Gear']")
    public WebElement gear;


    @FindBy(xpath = "//a/span[text()='Training']")
    public WebElement training;

    @FindBy(xpath = "//a/span[text()='Sale']")
    public WebElement sale;


    @FindBy(xpath = "(//a//span[text()='Tops'])[1]")
    public WebElement wtops;


    @FindBy(xpath = "(//a//span[text()='Bottoms'])[1]")
    public WebElement wbottoms;

    @FindBy(xpath = "(//a//span[text()='Tops'])[2]")
    public WebElement mtops;


    @FindBy(xpath = "(//a//span[text()='Bottoms'])[2]")
    public WebElement mbottoms;

    @FindBy(xpath = "//a//span[text()='Bags']")
    public WebElement bags;

    @FindBy(xpath = "//a//span[text()='Fitness Equipment']")
    public WebElement fequipment;

    @FindBy(xpath = "//a//span[text()='Video Download']")
    public WebElement videoDownload;


    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
//            case "openNewAccount": return this.openNewAccount;

        }
        return null;
    }
}

