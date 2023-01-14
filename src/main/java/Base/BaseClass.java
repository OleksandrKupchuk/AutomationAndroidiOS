package Base;

import ConfigDevices.Device;
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

    public static void setupIosApplicationOnLocalhost(Device device, String appPath) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            setupDefaultCapability(device, capabilities);
            capabilities.setCapability(MobileCapabilityType.APP, appPath);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            iosDriver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static void setupAndroidApplicationOnLocalhost(Device device, String appPackage, String appActivity) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            setupDefaultCapability(device, capabilities);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilities.setCapability("ignoreUnimportantViews", true);
            capabilities.setCapability("appPackage", appPackage);
            capabilities.setCapability("appActivity", appActivity);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            androidDriver = new AndroidDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static void setupApplicationOnBrowserStack(Device device) {
        try {
            String userName = "oleksandrkupchuk_XsRkH7";
            String accessKey = "mkD6pivwwsmcQRGmhjqV";

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("device", device.DEVICE_NAME);
            capabilities.setCapability("os_version", device.PLATFORM_VERSION);
            capabilities.setCapability("project", "Automation");
            capabilities.setCapability("build", "Run test");
            capabilities.setCapability("name", "Bstack-[Java] Sample Test");
            capabilities.setCapability("app", device.APP_URL);

            URL url = new URL("https://" + userName + ":" + accessKey +"@hub-cloud.browserstack.com/wd/hub");
            androidDriver = new AndroidDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static void setupMobileBrowserOnLocalhost(Device device) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            setupDefaultCapability(device, capabilities);
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, device.BROWSER_NAME);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            iosDriver = new IOSDriver(url, capabilities);
        }
        catch (Exception exception){
            System.out.println("Cause is " + exception.getCause());
            System.out.println("Message is " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void setupDefaultCapability(Device device,DesiredCapabilities capabilities){
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.PLATFORM_VERSION);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.AUTOMATION_NAME);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
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
