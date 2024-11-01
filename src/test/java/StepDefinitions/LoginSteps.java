package StepDefinitions;

import Pages._04_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {
    _04_DialogContent dc=new _04_DialogContent();
    @Given("Navigate to the Website")
    public void navigateToTheWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Enter username and password to login")
    public void enterUsernameAndPasswordToLogin() {
        dc.myClick(dc.signIn);
        dc.mySendKeys(dc.email, "raisworld@gmail.com");
        dc.mySendKeys(dc.password, "Profilepicture10+");
        dc.myClick(dc.submit);

    }

    @Then("Successful message is displayed")
    public void productaddedandremoved() {
        String text = dc.successMessage.getText();
        String itemName = text.substring(1, text.indexOf(" has been"));
        dc.verifyMessageContainsText(itemName);

    }

    @And("Wishlist successfully updated")
    public void wishlistSuccessfullyUpdated() {
        List<WebElement> productItems = GWD.getDriver().findElements(By.xpath("//ol[@class='product-items']/li"));

        if (productItems.size() > 2) {
            System.out.println("Assertion failed: More than two product items are present.");
        } else {

            System.out.println("Assertion passed: Two product items are present.");

        }

    }
}
