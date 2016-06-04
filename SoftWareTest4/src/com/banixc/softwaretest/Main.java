package com.banixc.softwaretest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Pro\\Chrome\\Application\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Pro\\Chrome\\Chrome\\chrome.exe");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://www.baidu.com");

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();

    }
}
