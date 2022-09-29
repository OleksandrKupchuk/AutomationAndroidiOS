package Base;

import ConfigDevices.Device;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import java.net.URL;

public class BaseClass {
    public static IOSDriver<MobileElement> iosDriver;

    public static void setup(Device device) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.PLATFORM_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.PLATFORM_VERSION);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.DEVICE_NAME);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.AUTOMATION_NAME);
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
            capabilities.setCapability(MobileCapabilityType.APP, device.PATH_APP);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            iosDriver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown(){
        iosDriver.quit();
    }
}
