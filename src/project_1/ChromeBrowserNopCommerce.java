package project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserNopCommerce {
   static String baseUrl= "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        //Launch the chromewebdriver
        WebDriver driver= new ChromeDriver();
        //Open the url
        driver.get(baseUrl);
        //Maximize the browser automatically
        driver.manage().window().maximize();
    // waiting time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page  : " + driver.getTitle());//driver.getTitle();
        //Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        //Navigate to url
        String navUrl="https://demo.nopcommerce.com/login?returnUrl= %2F";
        driver.navigate().to(navUrl);
        System.out.println("Get current url afte navigating page: " + driver.getCurrentUrl());

        //navigate to back
        driver.navigate().back();
        System.out.println("Get current url returning back : " + driver.getCurrentUrl());

        //Navigate to login
        driver.navigate().to(navUrl);
        System.out.println("The login url of page : " + driver.getCurrentUrl());

        //Refresh the page:
        driver.navigate().refresh();
        //Enter the email to email field
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("Prime12@gmail.com");
        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("12345");
        //CLick on Login Button
        driver.findElement(By.linkText("Log in")).click();


        //close the browser

        driver.quit();




    }

}
