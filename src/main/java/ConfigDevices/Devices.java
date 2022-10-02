package ConfigDevices;

import io.appium.java_client.remote.AutomationName;

public class Devices {

    public static IosDevice IPHONE_13_PRO_MAX_APP(String pathApp){
        IosDevice iphone_13_pro_max = new IosDevice();
        iphone_13_pro_max.platformType = PlatformType.IOS;
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        iphone_13_pro_max.BROWSER_NAME = "safari";
        iphone_13_pro_max.PATH_APP = pathApp;
        return iphone_13_pro_max;
    }

    public static IosDevice IPHONE_13_PRO_MAX_WEB(){
        IosDevice iphone_13_pro_max = new IosDevice();
        iphone_13_pro_max.platformType = PlatformType.IOS;
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        iphone_13_pro_max.BROWSER_NAME = "safari";
        return iphone_13_pro_max;
    }

    public static AndroidDevice XIAOMI_REDMI_NOTE_5_APP(String appPackage, String appActivity){
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

    public static AndroidDevice XIAOMI_REDMI_NOTE_5_WEB(){
        AndroidDevice xiaomi_redmi_note_5 = new AndroidDevice();
        xiaomi_redmi_note_5.platformType = PlatformType.ANDROID;
        xiaomi_redmi_note_5.PLATFORM_NAME = "Android";
        xiaomi_redmi_note_5.PLATFORM_VERSION = "9.0";
        xiaomi_redmi_note_5.DEVICE_NAME = "Redmi Note 5";
        xiaomi_redmi_note_5.BROWSER_NAME = "chrome";
        return xiaomi_redmi_note_5;
    }

    public static IosDevice IPAD_9TH_GENERATION(String pathApp){
        IosDevice ipad_9th_generation = new IosDevice();
        ipad_9th_generation.platformType = PlatformType.IOS;
        ipad_9th_generation.PLATFORM_NAME = "iOS";
        ipad_9th_generation.PLATFORM_VERSION = "15.0";
        ipad_9th_generation.DEVICE_NAME = "iPad (9th generation)";
        ipad_9th_generation.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        ipad_9th_generation.BROWSER_NAME = "safari";
        ipad_9th_generation.PATH_APP = pathApp;
        return ipad_9th_generation;
    }
}
