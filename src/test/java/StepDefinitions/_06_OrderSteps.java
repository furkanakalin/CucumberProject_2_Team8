package StepDefinitions;

import Pages._06_DialogContent;
import Pages._07_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

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
}
