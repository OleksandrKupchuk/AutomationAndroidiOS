package Tests.Android.Web;

import Base.BaseClass;
import ConfigDevices.Devices;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AndroidBrowserTest extends BaseClass {

    @BeforeMethod
    public void setup(){
        BaseClass.setupMobileBrowser(Devices.XIAOMI_REDMI_NOTE_5_WEB());
    }

    @SneakyThrows
    @Test
    public void findInformationInBrowser() {
        androidDriver.get("https://www.google.com.ua");
        androidDriver.findElementByName("q").sendKeys("Automation");
//        androidWait.wait(4000);
        androidDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
