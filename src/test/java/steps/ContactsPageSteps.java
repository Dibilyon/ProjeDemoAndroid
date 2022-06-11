package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateContactsPage;

import java.net.MalformedURLException;

public class ContactsPageSteps
{
    public ContactsPageSteps() throws MalformedURLException
    {

    }
    CreateContactsPage c1 = new CreateContactsPage();
    @When("Name text field is filled in")
    public void inputNameTxt(){c1.inputNameTxt();}
    @And("Surname text field is filled in")
    public void inputSurnameTxt(){c1.inputSurnameTxt();}
    @And("Email text is filled in")
    public void inputEmailTxt(){c1.inputEmailTxt();}
    @And("Scrolled to Account info section")
    public void scrollToAccountInfo(){c1.scrolltoAccountInfo();}
    @And("Country code is verified")
    public void verifyCountryCode(){c1.verifyCountryCode();}
    @And("Phone number text is filled in")
    public void inputPhoneNumberTxt(){c1.inputTelNo();}
    @And("Iban number is filled im")
    public void inputIbanTxt(){c1.inputibanNo();}
    @And("Norma Number is filled in")
    public void inputNormaNumberTxt(){c1.inputNormaNo();}
    @And ("Scroll to Invoice Info")
    public void scrollToInvoiceInfo(){c1.scrollToInvoiceInfo();}
    @And("Tc No is filled in")
    public void inputTcNumberTxt(){c1.inputTcNo();}
    @And("City dropdown is clicked")
    public void clickCityDropdown(){c1.openCityDropdown();}
    @And("City is selected")
    public void selectCity(){c1.selectCity();}
    @And("District Dropdown is clicked")
    public void clickDistrictDropdown(){c1.openDistrictDropdown();}
    @And("District is selected")
    public void selectDistrict(){c1.selectDistrict();}
    @And("Address is filled im")
    public void inputAddressTxt(){c1.inputAddressTxt();}
    @Then("Create button is clicked")
    public void createContactBtnClick(){c1.createContact2BtnClick();}
}
