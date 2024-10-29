package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_DialogContent extends ParentPage {

    public _05_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
//    @FindBy (xpath = "//a[@href='transfer.htm']")
//    public WebElement transferButton;

//    @FindBy (id = "toAccountId option[value='15564']")
//    public WebElement toAccountValue;

}

