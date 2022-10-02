package Tests.Android.Application.Scanner;

import Pages.Android.BaseAndroid;
import Pages.Android.Scanner.ScannerStartPage;
import org.testng.annotations.Test;

public class ScannerTest extends BaseAndroid {

    @Test
    public void scanner(){
        new ScannerStartPage(androidDriver)
                .clickOnMenu();
    }
}
