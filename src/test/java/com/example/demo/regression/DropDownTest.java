package com.example.demo.regression;

import com.example.demo.pages.MyPage;
import com.example.demo.pages.MyPage2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class DropDownTest extends BaseTest {

    private MyPage2 myPage2;

    @Test
    public void testSettingTextToTextBox() {
        myPage2 = new MyPage2();
        driver.get("http://output.jsbin.com/osebed/2");
        myPage2.selectItems(driver).selectByVisibleText("Orange");
        myPage2.selectItems(driver).selectByIndex(1);
    }

    @Test
    public void testTotalSizeOfOptions() {
        myPage2 = new MyPage2();
        driver.get("http://output.jsbin.com/osebed/2");
        int actualSize = myPage2.selectItems(driver).getOptions().size();
        Assertions.assertEquals(actualSize, 4);
    }

    @Test
    public void testFirstOption() {
        myPage2 = new MyPage2();
        driver.get("http://output.jsbin.com/osebed/2");
        WebElement option = myPage2.selectItems(driver).getFirstSelectedOption();
        String selectedValueInDropDown = option.getText();
        Assertions.assertEquals(selectedValueInDropDown, "Banana");
    }

    @Test
    public void testAllOptionNames() {
        myPage2 = new MyPage2();
        driver.get("http://output.jsbin.com/osebed/2");

        List<WebElement> actualOptions = myPage2.selectItems(driver).getOptions();

        actualOptions.stream().forEach(o -> {
            String option = o.getText();
            if(option.isEmpty()) {
                Assertions.fail();
            }

        });
    }

}
