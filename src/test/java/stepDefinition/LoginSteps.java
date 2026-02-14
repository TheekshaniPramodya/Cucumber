package stepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myslt.slt.lk/");
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/input")).sendKeys("your_username");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("your_password");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/button")).click();
        Thread.sleep(2000);

        // MOVE THE TRY-CATCH HERE (Inside the method)
        try {
            driver.findElement(By.cssSelector("i.fa-times-circle")).click();
            System.out.println("Popup closed successfully.");
        } catch (Exception e) {
            System.out.println("No popup appeared, proceeding...");
        }
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        String title = driver.getTitle();
        // Verify we are on the Home/Dashboard page [cite: 191]
        Assert.assertTrue("Login failed!", title.contains("Home") || title.contains("My SLT"));
        System.out.println("Login successful!");
        //driver.quit(); // Close the browser after test
    }
}