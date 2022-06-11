package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS;


public class Driver {
    private static AndroidDriver driver;

@BeforeTest
    public static AndroidDriver getDriver() throws MalformedURLException {

        if (driver == null) {
/*
  public static String userName = "ugurbaykoc_uhSVqD";
    public static String accessKey = "cYYyEgyP5zAKkvys5ap9";
            HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
            browserstackOptions.put("userName","ugurbaykoc_uhSVqD");
            browserstackOptions.put("accessKey","cYYyEgyP5zAKkvys5ap9");
*/
            DesiredCapabilities dc = new DesiredCapabilities();

            dc.setCapability("platformName", "Android");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, autoReceiveDevice.getDeviceName());
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, autoReceiveOSver.getPlatformVersion());
            dc.setCapability(AUTO_GRANT_PERMISSIONS, "true");
            dc.setCapability("app","/Users/ugurbaykoc/Downloads/Norma.apk");
            dc.setCapability("unicodeKeyboard", false);
            dc.setCapability("resetKeyboard", false);
            dc.setCapability("ignoreUnimportantViews",false);
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

/*

*/

        }
        return driver;
    }
@AfterTest
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }


    }

}
