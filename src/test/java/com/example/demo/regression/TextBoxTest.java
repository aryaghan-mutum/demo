package com.example.demo.regression;

import com.example.demo.pages.FacebookLoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends BaseTest {

    //reference
    private FacebookLoginPage facebookLoginPage;

    // note:
    // the username and password must not be written in the test level but
    // must be encripted or stored in a property file due to security reasons while
    // testing the apps
    final String username = "apple";
    final String password = "interview";

    @Test
    public void testTextBox() {
        facebookLoginPage = new FacebookLoginPage();
        driver.get("http://facebook.com");

        facebookLoginPage.setUsername(driver, username);
        facebookLoginPage.setPassword(driver, password);

        Assertions.assertEquals(facebookLoginPage.getUserName(driver), username);
        Assertions.assertEquals(facebookLoginPage.getPassword(driver), password);

        // clicking on a button
        facebookLoginPage.clickLoginBtn(driver);
        // after clicking we can validate in many ways. For ex: if it opens a new page then
        // we can verify the url or title of page.

    }
}
