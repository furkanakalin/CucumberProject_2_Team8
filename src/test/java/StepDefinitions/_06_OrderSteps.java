package StepDefinitions;

import Pages._06_DialogContent;
import Pages._07_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class _06_OrderSteps {
    _06_DialogContent dc = new _06_DialogContent();

    @And("Click on the product")
    public void clickOnTheProduct() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",
                GWD.getDriver().
                        findElement(By.xpath("//*[@id='maincontent']/div[3]/div/div[2]/div[4]/div/div/ol/li[2]/div/div")));
        js.executeScript("arguments[0].click();", dc.tankTop);
    }

    @And("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dtButtons) {
        List<String> buttons = dtButtons.asList();
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

        for (String button : buttons) {
            if (button.equals("proceedButton")) {
                try {
                    Thread.sleep(7000);
                    GWD.getDriver().navigate().refresh();
                    wait.until(ExpectedConditions.visibilityOf(dc.proceedButton));
                    dc.proceedButton.click();

                } catch (InterruptedException e) {
                    System.out.println("Bekleme sırasında hata " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Hata" + e.getMessage());
                }

            } else {
                WebElement element = wait.until(ExpectedConditions.visibilityOf(dc.getWebElement(button)));
                dc.myClick(element);
            }

        }
    }

    @And("User sending keys in DialogContent")
    public void userSendingKeysInDialogContent(DataTable dtboxandLetters) {
        List<List<String>> boxandLetters = dtboxandLetters.asLists();

        for (int i = 0; i < boxandLetters.size(); i++) {
            WebElement box = dc.getWebElement(boxandLetters.get(i).get(0));
            dc.mySendKeys(box, boxandLetters.get(i).get(1));
        }
    }

    @Then("User validates the payment message displayed")
    public void userValidatesThePaymentMessageDisplayed() {
        dc.verifyMessageContainsText(dc.paymentTitle, "payment");
    }

    @And("User validates the item is displayed")
    public void userValidatesTheItemIsDisplayed() {
        Assert.assertTrue(dc.billingCheck.isSelected());
    }

    @Then("User validates order {string}")
    public void userValidatesOrderString() {
        dc.verifyMessageContainsText(dc.thanksMessage,"thank");
    }

    @And("User validates the saved address")
    public void userValidatesTheSavedAddress() {
       Assert.assertTrue(dc.address.getAttribute("class").contains("selected-item"));
    }

}
