package Pages.Config;

public class ConfigurationDevices {
    private String PLATFORM_NAME;
    private String PLATFORM_VERSION;
    private String DEVICE_NAME;
    private String AUTOMATION_NAME;
    private String BROWSER_NAME;

    public ConfigurationDevices(String PLATFORM_NAME,String PLATFORM_VERSION,
                                String DEVICE_NAME,String AUTOMATION_NAME,
                                String BROWSER_NAME){
        this.PLATFORM_NAME = PLATFORM_NAME;
        this.PLATFORM_VERSION = PLATFORM_VERSION;
        this.DEVICE_NAME = DEVICE_NAME;
        this.AUTOMATION_NAME = AUTOMATION_NAME;
        this.BROWSER_NAME = BROWSER_NAME;
    }

}
