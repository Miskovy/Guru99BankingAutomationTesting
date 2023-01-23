package org.example.StepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.time.Duration;

public class Hooks {
    /* You can change the Path of FireFox based on your environment here */
    public static final String FIREFOX_PATH = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";

    // Setting Base URL
    public static final String BASE_URL = "http://www.demo.guru99.com/";

    // Time to wait when searching for a GUI element
    public static final int WAIT_TIME = 30;


    // Valid account for login
    public static final String USER_NAME = "mngr472694";
    public static final String PASSWD = "tAhyvEp";


    // Expected output
    public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
    public static WebDriver driver;
    @Before
    public static void OpenBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        DesiredCapabilities desired = new DesiredCapabilities();
        FirefoxOptions options = new FirefoxOptions();
        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}