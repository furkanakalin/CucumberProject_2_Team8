package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _01_DialogContent extends ParentPage {

    public _01_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createanaccount;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "email_address")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement confirm;

    @FindBy(xpath = "//*[@title='Create an Account']")
    public WebElement create;

    @FindBy(xpath = "//*[text()='Thank you for registering with Main Website Store.']")
    public WebElement successmessage;

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "createanaccount": return this.createanaccount;
            case "firstname": return this.firstname;
            case "lastname": return this.lastname;
            case "email": return this.email;
            case "password": return this.password;
            case "confirm": return this.confirm;
            case "create": return this.create;
        }

        return null;
    }
    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.successmessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

}
