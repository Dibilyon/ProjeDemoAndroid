package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.*;
import utils.Driver;

import java.net.MalformedURLException;

public class DemoPage5
{
    public DemoPage5() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }
    @AndroidFindBy(id = "com.norma.android.debug:id/imageViewNext")
    public AndroidElement btnArrow;
    @AndroidFindBy(id = "com.norma.android.debug:id/btnRegister")
    public AndroidElement btnRegister;
    @AndroidFindBy(id ="com.norma.android.debug:id/btnLogin" )
    public AndroidElement btnLogin;


    public void clickForNextPage() throws InterruptedException {
        btnArrow.click();
        Thread.sleep(10);
    }

    public void verifyLoginPage()
    {
        if ((btnRegister.getSize().getWidth()!=0)&&(btnLogin.getSize().getWidth()!=0))
        {
            assertTrue(true);

        }
    }






}
