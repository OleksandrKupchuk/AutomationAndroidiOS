package ConfigDevices;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Devices {

    public static IosDevice IPHONE_13_PRO_MAX_APP(String pathApp){
        IosDevice iphone_13_pro_max = new IosDevice();
        iphone_13_pro_max.platformType = PlatformType.IOS;
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        iphone_13_pro_max.PATH_APP = pathApp;

        return iphone_13_pro_max;
    }

    public static IosDevice IPHONE_13_PRO_MAX_WEB(){
        IosDevice iphone_13_pro_max = new IosDevice();
        iphone_13_pro_max.platformType = PlatformType.IOS;
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.BROWSER_NAME = "safari";
        return iphone_13_pro_max;
    }

    public static AndroidDevice XIAOMI_REDMI_NOTE_5(String appPackage, String appActivity){
        AndroidDevice xiaomi_redmi_note_5 = new AndroidDevice();
        xiaomi_redmi_note_5.platformType = PlatformType.ANDROID;
        xiaomi_redmi_note_5.PLATFORM_NAME = "Android";
        xiaomi_redmi_note_5.PLATFORM_VERSION = "9.0";
        xiaomi_redmi_note_5.DEVICE_NAME = "Redmi Note 5";
        xiaomi_redmi_note_5.BROWSER_NAME = "chrome";
        xiaomi_redmi_note_5.APP_PACKAGE = appPackage;
        xiaomi_redmi_note_5.APP_ACTIVITY = appActivity;
        return xiaomi_redmi_note_5;
    }
}
