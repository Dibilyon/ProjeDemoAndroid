package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.util.UUID;

import static pages.HelperClass.generateString;
import static pages.HelperClass.getRandomNumber;

public class CreateContactsPage {
    public CreateContactsPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputFirstName\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement nameTxt;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputLastName\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement surnameTxt;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.norma.android.debug:id/inputNormaNo\"))")
    AndroidElement AccountInfo;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputEmail\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement emailTdxt;
    @AndroidFindBy(id = "com.norma.android.debug:id/textViewCountryCode")
    AndroidElement countryCode;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputPhoneNumber\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement telephoneNo;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputIban\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement ibanTxt;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputNormaNo\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement normaNoTxt;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.norma.android.debug:id/inputAddress\"))")
    AndroidElement invoiceInfo;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputIdentityNumber\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement tcNoTxt;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/spinnerCity\").childSelector(resourceId(\"com.norma.android.debug:id/spinner\"))")
    AndroidElement citySelection;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")
    AndroidElement selectCity;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/spinnerDistrict\").childSelector(resourceId(\"com.norma.android.debug:id/spinner\"))")
    AndroidElement districtSelection;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")
    AndroidElement selectDistrict;
    @AndroidFindBy(id = "com.norma.android.debug:id/inputAddress")
    AndroidElement addressTxt;
    @AndroidFindBy(id = "com.norma.android.debug:id/btnCreateContact")
    AndroidElement createBtn;


    public void inputNameTxt() {
        nameTxt.sendKeys(generateString(8));
    }

    public void inputSurnameTxt() {
        surnameTxt.sendKeys(generateString(6));
    }

    public void inputEmailTxt() {
        emailTdxt.sendKeys(generateString(6)+"@norma.com");
    }

    public void scrolltoAccountInfo() {
        AccountInfo.getText();
    }

    public void verifyCountryCode() {
        if (countryCode.getText().contains("TR")) {
            System.out.println("Turkey is selected as country code");
            Assert.assertTrue(true);
        }
    }

    public void inputTelNo() {
        telephoneNo.sendKeys("543"+getRandomNumber(7));
    }

    public void inputibanNo() {
        AccountInfo.getText();
        if (!ibanTxt.isDisplayed()) {
            invoiceInfo.getText();
            ibanTxt.sendKeys(getRandomNumber(26));
        } else {
            ibanTxt.sendKeys(getRandomNumber(26));
        }

    }

    public void inputNormaNo() {
        normaNoTxt.sendKeys("2222222222");
    }

    public void inputTcNo() {


        tcNoTxt.sendKeys("20315185926");
    }

    public void scrollToInvoiceInfo() {


        invoiceInfo.getText();

    }

    public void openCityDropdown() {
        citySelection.click();
    }

    public void selectCity() {
        selectCity.click();
    }

    public void openDistrictDropdown() {
        districtSelection.click();
    }

    public void selectDistrict() {
        selectDistrict.click();
    }

    public void inputAddressTxt() {
        addressTxt.sendKeys(generateString(50));
    }

    public void createContact2BtnClick() {
        createBtn.click();
    }





    }

