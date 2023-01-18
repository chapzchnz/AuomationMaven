package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Go to the Amazon website
        driver.get("https://www.amazon.com/");

    }
}