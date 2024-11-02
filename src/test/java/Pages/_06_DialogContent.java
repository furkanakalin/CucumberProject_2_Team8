package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _06_DialogContent extends ParentPage {

    public _06_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[2]/div[4]/div/div/ol/li[2]/div/div/div[4]/div/div[1]/form/button")
    public WebElement tankTop;

    @FindBy(xpath = "//*[@id='option-label-size-143-item-167']")
    public WebElement size;

    @FindBy(id = "option-label-color-93-item-57")
    public WebElement colour;

    @FindBy(xpath = "//*[@id='product-addtocart-button']")
    public WebElement addToCart;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    public WebElement cartImg;

    @FindBy(xpath = "//*[@id='minicart-content-wrapper']/div[2]/div[5]/div/a/span")
    public WebElement cartCheck;

    @FindBy(id = "cart-398664-qty")
    public WebElement changeNumber;

    @FindBy(xpath = "//*[@id='form-validate']/div[2]/button[2]")
    public WebElement updateButton;

    @FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[2]/div[1]/ul/li[1]/button")
    public WebElement proceedButton;

    @FindBy(xpath = "//*[@id='checkout-shipping-method-load']/table/tbody/tr[2]/td[1]/input")
    public WebElement radioButton;

    @FindBy(xpath = "//*[@id='shipping-method-buttons-container']/div/button")
    public WebElement nextButton;

    @FindBy(xpath = "//*[@id='checkout-payment-method-load']/div/div/div[1]" )
    public WebElement paymentTitle;

     @FindBy(xpath = "//*[@id='billing-address-same-as-shipping-checkmo']")
    public WebElement billingCheck;

     @FindBy(xpath = "//*[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button")
    public WebElement placeOrder;

     @FindBy(xpath = "//*[@id='maincontent']/div[1]/h1/span")
    public WebElement thanksMessage;

     @FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[2]/p[1]/a") // kontrol et
    public WebElement orderID;

     @FindBy(xpath = "//*[@id='checkout-step-shipping']/div[1]/div/div/div[1]")
     public WebElement address;

     public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "tankTop" : return this.tankTop;
            case "size" : return this.size;
            case "colour" : return this.colour;
            case "addToCart" : return this.addToCart;
            case "cartImg" : return this.cartImg;
            case "cartCheck" : return this.cartCheck;
            case "changeNumber" : return this.changeNumber;
            case "updateButton" : return this.updateButton;
            case "proceedButton" : return this.proceedButton;
            case "radioButton" : return this.radioButton;
            case "nextButton" : return this.nextButton;
            case "paymentTitle" : return this.paymentTitle;
            case "billingCheck" : return this.billingCheck; // enable olduğunu doğrula
            case "placeOrder" : return this.placeOrder;
            case "thanksMessage" : return this.thanksMessage;
            case "orderID" : return this.orderID;
            case "address" : return this.address;
        }

        return null;
    }
    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.paymentTitle.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

}

