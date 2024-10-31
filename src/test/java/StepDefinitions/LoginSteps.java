package StepDefinitions;

import Pages._04_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginSteps {
    _04_DialogContent dc=new _04_DialogContent();

    @And("Click on the Element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dtButtons) {
        List<String> buttons=dtButtons.asList();
        for (int i = 0; i < buttons.size() ; i++) {
            dc.myClick(dc.getWebElement(buttons.get(i)));

        }
    }

    @And("User Sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dtboxandLetters) {
        List<List<String>> boxandLetters=dtboxandLetters.asLists();

        for (int i = 0; i < boxandLetters.size(); i++) {
            WebElement box= dc.getWebElement(boxandLetters.get(i).get(0));
            dc.mySendKeys(box, boxandLetters.get(i).get(1));
        }
    }

    @And("Hover over the Element in DialogContent")
    public void hoverOvertheElementinDialogContent(DataTable dtButton){
        List<String> buttons = dtButton.asList();

        for (int i = 0; i < buttons.size(); i++) {
            dc.hoverOver(dc.getWebElement(buttons.get(i)));
        }

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
