package Base;

import ConfigDevices.AndroidDevice;
import ConfigDevices.IosDevice;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import java.net.URL;

public class BaseClass {
    public static IOSDriver<MobileElement> iosDriver;
    public static AndroidDriver<AndroidElement> androidDriver;

    public static void setup(IosDevice device) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.PLATFORM_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.PLATFORM_VERSION);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.DEVICE_NAME);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.AUTOMATION_NAME);
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
            if(device.BROWSER_NAME != null){
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, device.BROWSER_NAME);
            }else {
                capabilities.setCapability(MobileCapabilityType.APP, device.PATH_APP);
            }

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            iosDriver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static void setup(AndroidDevice device) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.PLATFORM_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.PLATFORM_VERSION);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.DEVICE_NAME);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.AUTOMATION_NAME);
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
            if(device.BROWSER_NAME != null){
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, device.BROWSER_NAME);
            }
            else {
                capabilities.setCapability("appPackage", device.APP_PACKAGE);
                capabilities.setCapability("appActivity", device.APP_ACTIVITY);
            }

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            androidDriver = new AndroidDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown(){
        if(iosDriver != null){
            iosDriver.quit();
        }
        if(androidDriver != null){
            androidDriver.quit();
        }
    }
}
