package StepDefinitions;

import Pages._04_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @Then("Product is added to the WishList")
    public void productadded() {
        dc.verifyMessageContainsText("added");
    }

    @Then("Product is removed from the WishList")
    public void productremoved() {
        dc.verifyMessageContainsText("removed");
    }
}
