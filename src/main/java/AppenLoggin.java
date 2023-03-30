import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppenLoggin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://client.appen.com/sessions/new");
        WebElement emailField = driver.findElement(By.id("session_email"));
        String email = "felipe.jansen@outlook.com";
        emailField.sendKeys(email);
        driver.findElement(By.id("continue_button")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("session_password")));
        WebElement passwordField = driver.findElement(By.id("session_password"));
        String password = "8$05KPICk7&oifbr";
        passwordField.sendKeys(password);
        driver.findElement(By.id("submit_button")).click();
        // driver.close();
    }
}
