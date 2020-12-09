package com.example.demo.regression;

import com.example.demo.pages.MyPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownTest extends BaseTest {

    private MyPage myPage;

    @Test
    public void testSettingTextToTextBox() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");
        myPage.selectItems(driver).selectByVisibleText("Orange");
        myPage.selectItems(driver).selectByIndex(1);
    }

    @Test
    public void testTotalSizeOfOptions() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");
        int actualSize = myPage.selectItems(driver).getOptions().size();
        Assertions.assertEquals(actualSize, 4);
    }

    @Test
    public void testFirstOption() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");
        WebElement option = myPage.selectFirstItem(driver).getFirstSelectedOption();
        Assertions.assertEquals(option.getText(), "Banana");
    }

    @Test
    public void testAllOptionNamesIsEmpty() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");

        List<WebElement> actualOptions = myPage.selectItems(driver).getOptions();

        actualOptions.stream().forEach(o -> {
            String option = o.getText();
            if (option.isEmpty()) {
                Assertions.fail();
            }
        });
    }

}
