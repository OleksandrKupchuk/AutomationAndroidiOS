package Tests.Ios.Web;

import Base.BaseClass;
import ConfigDevices.Devices;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IosBrowserTest extends BaseClass {

    @BeforeMethod
    public void setup() {
        BaseClass.setupMobileBrowser(Devices.IPHONE_13_PRO_MAX_WEB());
    }

    @SneakyThrows
    @Test
    public void findInformationInBrowser() {
        iosDriver.get("https://www.google.com.ua");
        WebElement searchInGoogle = iosDriver.findElement(By.name("q"));
        searchInGoogle.click();
        searchInGoogle.sendKeys("Automation");
        searchInGoogle.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
}
