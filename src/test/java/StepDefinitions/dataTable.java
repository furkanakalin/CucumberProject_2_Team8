package StepDefinitions;

import Pages.LeftNav;
import Pages._01_DialogContent;
import Pages._04_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dataTable {

    @Given("Navigate to the Website")
    public void navigate_to_the_website() {
        // Write code here that turns the phrase above into concrete actions
        GWD.getDriver().get("https://magento.softwaretestingboard.com");
    }


}
