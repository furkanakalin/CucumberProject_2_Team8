package StepDefinitions;

import Pages._01_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_RegistrationStep {
    _01_DialogContent dc=new _01_DialogContent();

    @Given("Navigate to the Website")
    public void navigate_to_the_website() {
        // Write code here that turns the phrase above into concrete actions
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        throw new io.cucumber.java.PendingException();
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
