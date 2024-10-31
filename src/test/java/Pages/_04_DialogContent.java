
package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

    @FindBy(name = "login[password]")
    public WebElement password;

    @FindBy(xpath = "//button[@class='action login primary']")
    public WebElement submit;

    @FindBy(xpath = "(//div[@id='store.menu']//a)[1]")
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

    @FindBy(xpath = "(//strong/a)[8]")
    public WebElement product;

    @FindBy(xpath = "(//li[@class='item product product-item']/div)[8]")
    public WebElement product8;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@class='action towishlist']")
    public WebElement addWishList;

    @FindBy(xpath = "//div[@data-ui-id='message-success']/div")
    public WebElement addedMSG;

    @FindBy(xpath = "//strong//a[@title='Impulse Duffle']")
    public WebElement productName;

    @FindBy(xpath = "(//a[@data-role='remove'])[2]")
    public WebElement removeButton;

    @FindBy(xpath = "//button[@title='Update Wish List']")
    public WebElement updateButton;


    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
            case "women": return this.women;
            case "wtops": return this.wtops;
            case "wbottoms": return this.wbottoms;
            case "men": return this.men;
            case "mtops": return this.mtops;
            case "mbottoms": return this.mbottoms;
            case "gear": return this.gear;
            case "bags": return this.bags;
            case "fequipment": return this.fequipment;
            case "training": return this.training;
            case "vdownload": return this.videoDownload;
            case "whatsNew": return this.whatsNewButton;
            case "sale": return this.sale;

            case "product": return this.product;
            case "product8": return this.product8;
            case "message": return this.successMessage;
            case "addWishList": return this.addWishList;
            case "productName": return this.productName;
            case "removeButton": return this.removeButton;
            case "updateButton": return this.updateButton;

        }
        return null;
    }
    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.addedMSG.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

}

