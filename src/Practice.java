import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        String browser = "Chrome";
        //Setup Chrome browser//
        String baseUrl = "https://demo.nopcommerce.com/";
        WebDriver driver = new ChromeDriver();// open URl
        driver.get(baseUrl);

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

        WebElement loginButton = driver.findElement(By.cssSelector("input value['Log in']"));
        loginButton.click();

        //close the browser
        driver.quit();

    }
}
