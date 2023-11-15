package multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserTesting {

    static WebDriver driver;
    static String browser = "Chrome"; // change it to Firefox or Edge

    //Setup Chrome browser//
    static String baseUrl = "https://demo.nopcommerce.com/";


    public static void main(String[] args) {

            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Invalid browser name ");
            }

            //Get baseURL
            driver.get(baseUrl);


            //Print the title of the page//
            System.out.println("Title of the page : " + driver.getTitle());


            //Print current URL
            System.out.println("The current URL is : " + driver.getCurrentUrl());

            //Print the page source
            System.out.println("The page source is : " + driver.getPageSource());

            //Navigate to URl
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);
            System.out.println(" current URL : " + driver.getCurrentUrl());

            //Print the current URL
            System.out.println("Current URL after navigating :" + driver.getCurrentUrl());

            //Navigate back to home page
            driver.navigate().back();

            //Navigate to logging page
            driver.navigate().forward();

            //Print the current URL
            System.out.println("Current URl at login page : " + driver.getCurrentUrl());

            //refresh the page
            driver.navigate().refresh();

            //enter the email to email field
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("prexastudy@gmail.com");

            //Enter the password
            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("Abcd1234");

            //click on login button

            WebElement loginButton = driver.findElement(By.linkText("Log in"));
            loginButton.click();

            //close the browser
            driver.quit();

        }
    }

