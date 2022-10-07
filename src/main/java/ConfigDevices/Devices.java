package ConfigDevices;

import io.appium.java_client.remote.AutomationName;

public class Devices {

    public static Device IPHONE_13_PRO_MAX(){
        Device iphone_13_pro_max = new Device();
        iphone_13_pro_max.platformType = PlatformType.IOS;
        iphone_13_pro_max.PLATFORM_NAME = "iOS";
        iphone_13_pro_max.PLATFORM_VERSION = "15.0";
        iphone_13_pro_max.DEVICE_NAME = "iPhone 13 Pro";
        iphone_13_pro_max.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        iphone_13_pro_max.BROWSER_NAME = "safari";
        return iphone_13_pro_max;
    }

    public static Device XIAOMI_REDMI_NOTE_5(){
        Device xiaomi_redmi_note_5 = new Device();
        xiaomi_redmi_note_5.platformType = PlatformType.ANDROID;
        xiaomi_redmi_note_5.PLATFORM_NAME = "Android";
        xiaomi_redmi_note_5.PLATFORM_VERSION = "9.0";
        xiaomi_redmi_note_5.DEVICE_NAME = "Redmi Note 5";
        xiaomi_redmi_note_5.BROWSER_NAME = "chrome";
        return xiaomi_redmi_note_5;
    }

    public static Device IPAD_9TH_GENERATION(){
        Device ipad_9th_generation = new Device();
        ipad_9th_generation.platformType = PlatformType.IOS;
        ipad_9th_generation.PLATFORM_NAME = "iOS";
        ipad_9th_generation.PLATFORM_VERSION = "15.0";
        ipad_9th_generation.DEVICE_NAME = "iPad (9th generation)";
        ipad_9th_generation.AUTOMATION_NAME = AutomationName.IOS_XCUI_TEST;
        ipad_9th_generation.BROWSER_NAME = "safari";
        return ipad_9th_generation;
    }

    public static Device SAMSUNG_S10PLUS_APP(){
        Device xiaomi_redmi_note_5 = new Device();
        xiaomi_redmi_note_5.platformType = PlatformType.ANDROID;
        xiaomi_redmi_note_5.PLATFORM_NAME = "Android";
        xiaomi_redmi_note_5.PLATFORM_VERSION = "9.0";
        xiaomi_redmi_note_5.DEVICE_NAME = "Samsung Galaxy S10 Plus";
        return xiaomi_redmi_note_5;
    }
}
