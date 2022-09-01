package Pages.Ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class BaseIos {
    public IOSDriver<MobileElement> driver;

    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13 Pro");
//            capabilities.setCapability(MobileCapabilityType.UDID, "2D08CA66-9F5F-4D2C-9EA0-DC871C592B3D");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
//            capabilities.setCapability(MobileCapabilityType.APP, "/Users/oleksandrkupchuk/Library/Developer/Xcode/DerivedData/WebDriverAgent-heluqzvshawyozhcvahmgwxcttfj/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
//            capabilities.setCapability(MobileCapabilityType.APP, "/Users/oleksandrkupchuk/UIKitCatalog-iphonesimulator.app");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown(){
//        driver.close();
        driver.quit();
    }
}
