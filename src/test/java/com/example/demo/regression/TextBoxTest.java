package com.example.demo.regression;

import com.example.demo.pages.FacebookLoginPage;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends BaseTest {

    //reference
    private FacebookLoginPage facebookLoginPage;

    @Test
    public void testTextBox() {
        facebookLoginPage = new FacebookLoginPage();
        driver.get("http://facebook.com");
        facebookLoginPage.setUsername(driver, "apple");
        facebookLoginPage.setPassword(driver, "interview");

        // clicking on a button
        facebookLoginPage.clickLoginBtn(driver);

    }
}
