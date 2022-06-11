package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Driver;

import java.net.MalformedURLException;

public class DemoPage2
{
    public DemoPage2() throws MalformedURLException{
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }
    @AndroidFindBy(id = "com.norma.android.debug:id/imageViewNext")
    public AndroidElement btnArrow;


    public void clickForNextPage()
    {
        btnArrow.click();
    }






}
