package com.example.demo.regression;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TitleTest extends BaseTest {

    @Test
    public void validateFBTitle() {
        final String url = "https://www.facebook.com/";
        driver.get(url);
        String tile = driver.getTitle();
        Assertions.assertEquals(tile, "Facebook - Log In or Sign Up");
    }

    @Test
    public void validateAppleTitle() {
        final String url = "https://www.apple.com/";
        driver.get(url);
        String tile = driver.getTitle();
        Assertions.assertEquals(tile, "Apple");
    }


}
