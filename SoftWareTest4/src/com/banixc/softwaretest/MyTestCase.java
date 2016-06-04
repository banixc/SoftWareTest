package com.banixc.softwaretest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MyTestCase {

    private String param1;
    private String result ;
    private ChromeDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Pro\\Chrome\\Application\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Pro\\Chrome\\Chrome\\chrome.exe");
        driver = new ChromeDriver(options);


    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList( new Object[][] {
                { "陈旭" ,"陈旭"},
                { "A","A" },
                { "android","android" },
                {"andriod","android" },
                {"练习","练习"},
                {"工商银行","工商银行"},
                {"intel","intel"},

        });
    }

    public MyTestCase(String param ,String result){
        this.param1 = param;
        this.result = result;
    }
    @Test
    public void testBaiduSearch() throws Exception {
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        driver.findElementById("kw").sendKeys(this.param1);
        driver.findElementById("su").click();
        Thread.sleep(3000);
        assertEquals(this.result,driver.getTitle().concat(this.result));
    }


    @After
    public void tearDown()throws Exception {
        driver.quit();
    }
}
