package com.example.demo.regression;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * author: Anurag Muthyam
 * github: https://github.com/aryaghan-mutum
 */

public class BaseTest {

    public SoftAssertions softAssertion;
    public WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/geckodriver");
      //  softAssertion = new SoftAssertions();

        driver = new FirefoxDriver();
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
