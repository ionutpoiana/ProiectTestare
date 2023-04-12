package stepsDefinition;

import io.cucumber.java.After;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.util.Set;
import static java.lang.Thread.sleep;

public class StartDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
            throw new IllegalStateException("Driver has not been initialized. " +
                    "Please call StartDriver.setup() before use this method");
        }
    }

    public static void setup(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/main/java/driver/Adblock1.crx"));
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setPosition(new Point(2000,0));
        driver.manage().window().maximize();
        sleep(3000);
        String fereastraPrincipala = driver.getWindowHandle();
        Set<String> toateFerestrele = driver.getWindowHandles();
        for (String fereastraSecundara : toateFerestrele) {
            if (!fereastraPrincipala.equalsIgnoreCase(fereastraSecundara)) {
                driver.switchTo().window(fereastraSecundara);
                driver.close();
            }
        }
        driver.switchTo().window(fereastraPrincipala);
        driver.get(url);
    }

    @After
    public static void tearDown() {
        if (driver!=null){
        driver.quit();
        driver =null;
        }
    }

}
