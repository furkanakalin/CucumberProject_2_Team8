package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class _08_DialogContent extends ParentPage {

    public _08_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }



    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {

        }

        return null;
    }

}
