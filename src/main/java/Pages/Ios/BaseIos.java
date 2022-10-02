package Pages.Ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class BaseIos {
    public IOSDriver<MobileElement> iosDriver;

    @BeforeMethod()
    public void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13 Pro");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120");
//            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/oleksandrkupchuk/Library/Developer/Xcode/DerivedData/WebDriverAgent-heluqzvshawyozhcvahmgwxcttfj/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
//            capabilities.setCapability(MobileCapabilityType.APP, "/Users/oleksandrkupchuk/UIKitCatalog-iphonesimulator.app");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            iosDriver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
