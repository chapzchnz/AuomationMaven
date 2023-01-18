package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Go to the Amazon website
        driver.get("https://www.amazon.com/");

        // click on All icon sing Xpath
       // driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]")).click();

        //driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\\"nav-main\\\"]/div[1]\")).click();")).click();
       // driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\"CardInstancer9ECHhSMOeagigqzlPgwsw\"]/div/ul/li[2]/div/a")).click();

        // login automation sign in  and enter

        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("chapzchnz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        //password enter
        driver.findElement(By.id("ap_password")).sendKeys("#Zuko1234");
        driver.findElement(By.id("signInSubmit")).click();

        //Drop down
        driver.findElement(By.className("a-dropdown-link a-active")).click();
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).click();






    }
}