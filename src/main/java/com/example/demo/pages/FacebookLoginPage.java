package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {

    private final String fbUserNameTextBox = "//input[@name='email']";
    private final String fbPasswordTextBox = "pass";
    private final String fbLoginBtn = "u_0_b";


    /**
     *
     * @param driver
     * @param username
     * @return
     */
    public FacebookLoginPage setUsername(WebDriver driver, String username) {
        driver.findElement(By.xpath(fbUserNameTextBox)).sendKeys(username);
        return this;
    }

    /**
     *
     * @param driver
     * @param password
     * @return
     */
    public FacebookLoginPage setPassword(WebDriver driver, String password) {
        driver.findElement(By.id(fbPasswordTextBox)).sendKeys(password);
        return this;
    }

    /**
     *
     * @param driver
     * @return
     */
    public FacebookLoginPage clickLoginBtn(WebDriver driver) {
        driver.findElement(By.id(fbLoginBtn)).click();
        return this;
    }

    /**
     *
     * @param driver
     * @param username
     * @param password
     * @return
     */
    public FacebookLoginPage facebookLogin(WebDriver driver, String username, String password) {
        setUsername(driver, username).setPassword(driver, password).clickLoginBtn(driver);
        return this;
    }

}
