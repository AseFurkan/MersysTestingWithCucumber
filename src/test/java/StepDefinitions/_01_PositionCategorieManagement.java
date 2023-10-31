package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_PositionCategorieManagement {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    String name="Adem";
    String shortname="adm";

    @Given("Navigate to positions")
    public void navigateToPositions() {
        ln.myClick(ln.humanResources);
        ln.myClick(ln.setupTree);
        ln.myClick(ln.positions);

    }

    @When("Add a new position")
    public void addANewPosition() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.ShortName,shortname);
        dc.myClick(dc.saveButton);
    }

    @Then("Edit the position")
    public void editThePosition() {
        dc.mySendKeys(dc.searchInput,name);
        dc.myClick(dc.searchButton);
        dc.myClick(dc.active);
    }

    @And("Delete the position")
    public void deleteThePosition() {
        dc.mySendKeys(dc.searchInput,name);
        dc.myClick(dc.deleteImageBtn);
        dc.myClick(dc.deleteDialogBtn);
    }
}