package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'success')]")
    public WebElement successMessage;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='shortName']//input" )
    public WebElement ShortName;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(css =" ms-dialog-content input[data-placeholder='Integration Code']")
    public WebElement integrationCode;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;

    @FindBy(xpath="//mat-select//span[text()='Academic Period']")
    private WebElement academicPeriod;

    @FindBy(xpath="//mat-option/span")
    private WebElement academicPeriod1;

    @FindBy(xpath="(//span[text()='Grade Level'])[1]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//*[@role='option'])[4]")
    private WebElement gradeLevel2;

    @FindBy(xpath="//mat-select//span[text()='Test 2024']")
    private WebElement searchAcademicPeriod;

    @FindBy(xpath="//input[@id='ms-text-field-2']")
    public WebElement ibanBox;

    @FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[12]")
    public WebElement edit;















































    @FindBy(xpath="(//*[@class='mdc-switch__ripple']")
    public WebElement active;

    @FindBy(id="mat-select-4")
    public WebElement fieldType;

    @FindBy(xpath="//span[@class='mat-option-text']")
    public WebElement fieldTypes;



    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "addButton": return this.addButton;
            case "saveButton": return this.saveButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "integrationCode": return this.integrationCode;
            case "priorityCode": return this.priorityCode;
            case "toggleBar": return this.toggleBar;
            case "academicPeriod": return this.academicPeriod;
            case "academicPeriod1": return this.academicPeriod1;
            case "gradeLevel": return this.gradeLevel;
            case "gradeLevel2": return this.gradeLevel2;
            case "searchAcademicPeriod": return this.searchAcademicPeriod;
            case "ibanBox": return this.ibanBox;
            case "currency": return this.currency;
            case "currency1": return this.currency1;
            case "searchNameInput": return this.searchNameInput;
            case "deleteBtn": return this.deleteBtn;
            case "actionDeleteBtn": return this.actionDeleteBtn;
            case "lastEdit": return this.lastEdit;
            case "deletelast": return this.deletelast;
            case "order": return this.order;
        }

        return null;
    }





























//*****************************************
    @FindBy (css = "ms-dialog-content mat-select")
    public WebElement currency;

    @FindBy (xpath = "//mat-option/span")
    public WebElement currency1;



    @FindBy(xpath="//input[@data-placeholder='Name']")
    public WebElement name;


    @FindBy(xpath="//ms-edit-button[@class='ng-star-inserted']")
    public WebElement edit2;

    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(css = "ms-delete-button")
    public WebElement deleteBtn;

    @FindBy(css = "button[type='submit']")
    public WebElement actionDeleteBtn;

    @FindBy(css = "table tr:last-child ms-edit-button button")
    public WebElement lastEdit;

    @FindBy(css = "table tr:last-child ms-delete-button")
    public WebElement deletelast;

    @FindBy (css = "ms-text-field input[data-placeholder='Order']")
    public WebElement order;



    public void deleteItem(String searchText){
        mySendKeys(searchInput, searchText);
        myClick(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);

    }
}
