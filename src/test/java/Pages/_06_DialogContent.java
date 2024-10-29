package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06_DialogContent extends ParentPage {

    public _06_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }



     public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {

        }

        return null;
    }

}

