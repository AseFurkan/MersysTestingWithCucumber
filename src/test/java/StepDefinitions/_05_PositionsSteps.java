package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_PositionsSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("Go to positions page HR->Setup->Positions")
    public void goToPositionsPageHRSetupPositions() {
        ln.myClick(ln.humanResources);
        ln.myClick(ln.setupTree);
        ln.myClick(ln.positions);

    }

    @When("Add a new position by using name and short name")
    public void addANewPositionByUsingNameAndShortName() {
        dc.myClick(dc.addButton);
        dc.nameInput.sendKeys("qaqac");
        dc.ShortName.sendKeys("wwww");
        dc.myClick(dc.saveButton);
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @When("Edit position")
    public void editPosition() {
        dc.myClick(dc.edit);
        dc.nameInput.sendKeys("x");
        dc.ShortName.sendKeys("c");
        dc.myClick(dc.saveButton);
        dc.verifyContainsText(dc.successMessage, "success");

    }

    @Then("Delete position")
    public void deletePosition() {
        dc.mySendKeys(dc.searchInput, "qaqacx");
        dc.myClick(dc.searchButton);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.myClick(dc.deleteImageBtn);
        dc.myClick(dc.deleteDialogBtn);
        dc.verifyContainsText(dc.successMessage, "success");
    }

    @Then("Active and non active positions")
    public void activeAndNonActivePositions() {

    }
}
