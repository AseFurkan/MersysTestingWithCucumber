package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_AddingFields {
    WebDriverWait justWait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
    JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    String name = "ııııı";
    String code = "ooooo";
    String nameUpdated = "zzzz";


    @Given("Navigate to fields")
    public void navigateToFields() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.fields);
    }

    @When("Add a new field")
    public void addANewField() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.codeInput, code);
        dc.myClick(dc.saveButton);
    }

    @Then("Edit the field")
    public void editTheField() {
        dc.mySendKeys(dc.searchInput,name);
        dc.myClick(dc.searchButton);
        justWait.until(ExpectedConditions.elementToBeClickable(dc.editBtn));
        js.executeScript("arguments[0].click();", dc.editBtn);
        dc.mySendKeys(dc.nameInput, nameUpdated);
        dc.myClick(dc.saveButton);
    }

    @And("Delete the field")
    public void deleteTheField() {
        dc.mySendKeys(dc.searchInput,nameUpdated);
        dc.myClick(dc.searchButton);
        justWait.until(ExpectedConditions.elementToBeClickable(dc.deleteImageBtn));
        js.executeScript("arguments[0].click();", dc.deleteImageBtn);
        js.executeScript("arguments[0].click();", dc.deleteDialogBtn);
    }

    @And("The field should be deleted successfully")
    public void theFieldShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage,"success");
    }

}
