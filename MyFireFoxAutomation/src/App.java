import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,
                "/Users/murodjoni/Desktop/Selenium_Automation_JAVA/drivers/geckodriver");

        Map<String, String> mobileEmulation = new HashMap<>();

        // adding name of the device to emulate
        mobileEmulation.put("deviceName", "iPhone X");

        FirefoxOptions options = new FirefoxOptions()
                .addPreference("browser.startup.page", 1)
                .addPreference("browser.startup.homepage", "https://www.google.com")
                .setAcceptInsecureCerts(true);
        WebDriver driver = new FirefoxDriver(options);
    }
}
