package StepDefinitions;

import Pages._07_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _07_SearchFunctionalitySteps {
    _07_DialogContent dc = new _07_DialogContent();
    @Given("User navigates to the WebPage")
    public void userNavigatesToTheWebPage() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }


    @Then("User searches for an item {string}")
    public void userSearchesForAnItem(String itemName) {
        dc.mySendKeys(dc.searchBox, itemName);
        dc.myClick(dc.searchButton);
    }

    @Then("User validates the item is displayed and clicks on it")
    public void userValidatesTheItemIsDisplayedAndClicksOnIt() {
        Assert.assertTrue(dc.searchResultLink.isDisplayed());
        dc.myClick(dc.searchResultLink);
    }

    @Then("User validates the SKU number is same as {string}")
    public void userValidatesTheSKUNumberIsSameAs(String itemName) {
        Assert.assertEquals(dc.skuNumber.getText(),itemName);
    }

    @And("User clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        dc.myClick(dc.addToCartButton);
    }

    @Then("User validates search result is {string}")
    public void userValidatesSearchResultIs(String text) {
        dc.scrolltoElement(dc.noResultsMessage);
        Assert.assertEquals(dc.noResultsMessage.getText().trim().toLowerCase(),text.trim().toLowerCase());
    }
}
