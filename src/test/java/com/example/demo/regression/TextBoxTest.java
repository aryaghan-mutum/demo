package com.example.demo.regression;

import com.example.demo.pages.FacebookLoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends BaseTest {

    //reference
    private FacebookLoginPage facebookLoginPage;

    @Test
    public void testTextBox() {
        facebookLoginPage = new FacebookLoginPage();
        driver.get("http://facebook.com");

        // note:
        // the username and password must not be writte in the test level but
        // must be encripted or stored in a property file. T
        final String username = "apple";
        final String password = "interview";

        facebookLoginPage.setUsername(driver, username);
        facebookLoginPage.setPassword(driver, password);

        Assertions.assertEquals(facebookLoginPage.getUserName(driver), username);
        Assertions.assertEquals(facebookLoginPage.getPassword(driver), password);

        // clicking on a button
        facebookLoginPage.clickLoginBtn(driver);

    }
}
