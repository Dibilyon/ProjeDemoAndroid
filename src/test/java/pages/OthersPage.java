package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import java.net.MalformedURLException;

public class OthersPage {
    public OthersPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);

    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout")
    private AndroidElement contactsBtn;
    @AndroidFindBy(id = "com.norma.android.debug:id/buttonAdd")
    private AndroidElement addContactsBtn;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)."
            + "resourceId(\"com.norma.android.debug:id/recyclerViewOthersTab\"))"
            + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"Ürünler\"))")
    private  AndroidElement itemsBtn;
    @AndroidFindBy(id = "com.norma.android.debug:id/buttonAdd")
    private  AndroidElement addItemsBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]")
    private  AndroidElement navToOthersPage;

    public void contactsButtonClick() {
        contactsBtn.click();
    }

    public void createContactsButtonClick() {
        addContactsBtn.click();
    }

    public void itemsButtonClick() {
        itemsBtn.click();
    }

    public void createItemsButtonClick() {

        if ((addItemsBtn.getSize().getHeight()>0)&& (addItemsBtn.getText().contains("Ürün"))) {
            addItemsBtn.click();
        } else if (navToOthersPage.getSize().getWidth() > 0) {
            navToOthersPage.click();
            itemsBtn.click();
            addItemsBtn.click();
        } else {
            System.out.println("Yanlış sayfa");
        }
    }
    public void navToOthersPage()
    {
        navToOthersPage.click();
    }

}
