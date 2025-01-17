package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * author: Anurag Muthyam
 * github: https://github.com/aryaghan-mutum
 */
public class FacebookLoginPage {

    private final String fbUserNameTextBox = "//input[@name='email']";
    private final String fbPasswordTextBox = "pass";
    private final String fbLoginBtn = "u_0_b";


    /**
     * Get username text from text box
     * @param driver
     * @return
     */
    public String getUserName(WebDriver driver) {
        WebElement webElement = driver.findElement(By.xpath(fbUserNameTextBox));
        String username = webElement.getAttribute("value");
        return username;
    }

    /**
     * Get password text from text box
     * @param driver
     * @return
     */
    public String getPassword(WebDriver driver) {
        WebElement webElement = driver.findElement(By.name(fbPasswordTextBox));
        String pass = webElement.getAttribute("value");
        return pass;
    }

    /**
     * Set username
     * @param driver
     * @param username
     * @return
     */
    public FacebookLoginPage setUsername(WebDriver driver, String username) {
        driver.findElement(By.xpath(fbUserNameTextBox)).sendKeys(username);
        return this;
    }

    /**
     * Set password
     * @param driver
     * @param password
     * @return
     */
    public FacebookLoginPage setPassword(WebDriver driver, String password) {
        driver.findElement(By.id(fbPasswordTextBox)).sendKeys(password);
        return this;
    }

    /**
     * Click the button
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
