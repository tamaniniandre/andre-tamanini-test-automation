package com.andre.tamanini.fwk.driverfactory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> dr = new ThreadLocal();

    public static  WebDriver getDriver(){
        return dr.get();
    }

    public static void setWebDriver(WebDriver driver){
        dr.set(driver);
    }
}
