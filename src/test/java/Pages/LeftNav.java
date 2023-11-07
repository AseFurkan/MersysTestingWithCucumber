package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccounts;


    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath="(//span[text()='Human Resources'])")
    public WebElement humanResources;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    public WebElement setupTree;

    @FindBy(xpath="(//span[text()='Positions'])")
    public WebElement positions;








































    @FindBy(xpath="//span[text()='Fields']")
    public WebElement fields;



    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "countries": return this.countries;
            case "citizenShip": return this.citizenShip;
            case "nationalities": return this.nationalities;
            case "fees": return this.fees;
            case "entranceExamsOne": return this.entranceExamsOne;
            case "setupTwo": return this.setupTwo;
            case "entranceExamsTwo": return this.entranceExamsTwo;
            case "bankAccounts": return this.bankAccounts;
            case "gradeLevels": return this.gradeLevels;



        }































        return null;
    }

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;






}
