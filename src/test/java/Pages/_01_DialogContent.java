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



    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {

        }

        return null;
    }

}
