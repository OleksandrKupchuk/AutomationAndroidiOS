package ConfigDevices;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Devices {

    public static Device IPHONE_13_PRO_MAX_APP(String pathApp){
        Device iphone_13_pro_max = new Device();
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        iphone_13_pro_max.PATH_APP = pathApp;

        return iphone_13_pro_max;
    }

    public static Device IPHONE_13_PRO_MAX_WEB(){
        Device iphone_13_pro_max = new Device();
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.BROWSER_NAME = "safari";
        return iphone_13_pro_max;
    }

    public static void SetDevice(IOSDriver driver, Device device) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(io.appium.java_client.remote.MobileCapabilityType.PLATFORM_NAME, device.PLATFORM_NAME);
            capabilities.setCapability(io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION, device.PLATFORM_VERSION);
            capabilities.setCapability(io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME, device.DEVICE_NAME);
//            capabilities.setCapability(MobileCapabilityType.UDID, "2D08CA66-9F5F-4D2C-9EA0-DC871C592B3D");
            capabilities.setCapability(io.appium.java_client.remote.MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
//            capabilities.setCapability(MobileCapabilityType.APP, "/Users/oleksandrkupchuk/Library/Developer/Xcode/DerivedData/WebDriverAgent-heluqzvshawyozhcvahmgwxcttfj/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
//            capabilities.setCapability(MobileCapabilityType.APP, "/Users/oleksandrkupchuk/UIKitCatalog-iphonesimulator.app");
            if(device.PATH_APP != null || device.PATH_APP != ""){
                capabilities.setCapability(io.appium.java_client.remote.MobileCapabilityType.APP, device.PATH_APP);
            }
            else {
                capabilities.setCapability(io.appium.java_client.remote.MobileCapabilityType.BROWSER_NAME, "safari");
            }

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
