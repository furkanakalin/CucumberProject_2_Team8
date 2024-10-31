package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07_DialogContent extends ParentPage {

    public _07_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@title='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class='product-item-link']")
    public WebElement searchResultLink;

    @FindBy(xpath = "//div[@itemprop='sku']")
    public WebElement skuNumber;

    @FindBy(xpath = "//button[@title='Add to Cart']")
    public WebElement addToCartButton;

//    @FindBy(xpath = "//span[@class='base']")
//    public WebElement searchResultMessage;

    @FindBy(xpath = "//div[contains(text(),'no results')]")
    public WebElement noResultsMessage;

}



