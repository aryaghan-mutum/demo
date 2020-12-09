package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyPage {

    private final String boxId = "";

    /**
     * Getting an element from the page and set the text to the text box
     * @param driver
     * @param text
     * @return
     */
    public MyPage setTextToTextBox(WebDriver driver, String text) {
        driver.findElement(By.xpath(boxId)).sendKeys(text);
        return this;
    }
}
