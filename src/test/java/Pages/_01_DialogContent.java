package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

}
