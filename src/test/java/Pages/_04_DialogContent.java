
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

    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
//            case "openNewAccount": return this.openNewAccount;

        }
        return null;
    }
}

