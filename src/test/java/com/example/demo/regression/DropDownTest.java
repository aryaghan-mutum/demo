package com.example.demo.regression;

import com.example.demo.pages.MyPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownTest extends BaseTest {

    private MyPage myPage;

    /**
     * Selects any element in the drodown for testing piurposes
     */
    @Test
    public void testSettingTextToTextBox() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");
        myPage.selectItems(driver).selectByVisibleText("Orange");
        myPage.selectItems(driver).selectByIndex(1);
        boolean isSelectedMultipleOption = myPage.selectItems(driver).isMultiple();
        Assertions.assertEquals(isSelectedMultipleOption, true);

    }

    /**
     * Gets a total number of options/items from the dropdown elements and validates the size
     */
    @Test
    public void testTotalSizeOfOptions() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");
        int actualSize = myPage.selectItems(driver).getOptions().size();
        Assertions.assertEquals(actualSize, 4);
    }

    /**
     * A simple test to test the text of the first option in the dropdown.
     * If it is not the same the test fails
     */
    @Test
    public void testFirstOption() {
        myPage = new MyPage();
        driver.get("http://output.jsbin.com/osebed/2");
        WebElement option = myPage.selectFirstItem(driver).getFirstSelectedOption();
        Assertions.assertEquals(option.getText(), "Banana");
    }


    /**
     * Validate all the options in the dropdown in not null or empty
     * if one of the option is empty then the test fails.
     * used: hard assertions.
     * NOTE: Soft assertion can also be used here to see how many options are null in the logs
     */
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
