package com.andre.tamanini.fwk.hooks;
import com.andre.tamanini.fwk.config.Config;
import com.andre.tamanini.fwk.driverfactory.DriverFactory;
import com.andre.tamanini.fwk.helpers.YamlHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static Config config = null;

    private WebDriver driver;

    @Before
    public synchronized void beforeAll(Scenario scenario) throws IOException {
        config = YamlHelper.readConfigYaml();

        switch (config.getBrowser().toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir").concat("\\src\\main\\resources\\drivers\\chromedriver.exe"));
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                if(config.getIsHeadless().equals("true"))
                    options.addArguments("--headless", "--disable-gpu","--ignore-certificate-errors", "--silent");
                driver = new ChromeDriver(options);
        }
        driver.navigate().to(config.getDefaultUrl());
        DriverFactory.setWebDriver(driver);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getDefaultWaitTimeInSeconds()), TimeUnit.SECONDS);
    }
    @After
    public void quit(){
        DriverFactory.getDriver().quit();
    }

}
