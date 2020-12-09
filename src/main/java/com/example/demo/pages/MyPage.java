package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MyPage {

    private final String dropDownId = "fruits";

    /**
     *
     * @param driver
     * @return
     */
    public Select selectItems(WebDriver driver) {
        Select fruits = new Select(driver.findElement(By.id(dropDownId)));
        return fruits;
    }

}
