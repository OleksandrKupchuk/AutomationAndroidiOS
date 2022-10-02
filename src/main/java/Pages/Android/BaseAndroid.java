package Pages.Android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseAndroid {
    public AndroidDriver<AndroidElement> androidDriver;

    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 5");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            capabilities.setCapability(MobileCapabilityType.UDID, "43c6f2e8");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");

            //for browser
//            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//            capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));

            //for application
//            capabilities.setCapability("appPackage", "com.miui.calculator");
//            capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

//            capabilities.setCapability("appPackage", "com.gamma.scan");
//            capabilities.setCapability("appActivity", "com.gamma.barcodeapp.ui.BarcodeCaptureActivity");

            capabilities.setCapability("appPackage", "com.h6ah4i.android.example.advrecyclerview");
            capabilities.setCapability("appActivity", "com.h6ah4i.android.example.advrecyclerview.launcher.MainActivity");


            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            androidDriver = new AndroidDriver(url, capabilities);
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
//        driver.quit();
    }
}
