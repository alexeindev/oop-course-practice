package Encapsulation.POMExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            // ENCAPSULATION: The test doesn't know:
            // - What locators are used (id, xpath, css?)
            // - How many steps the login takes
            // - If there are waits or validations inside
            // - If there is a change in the login functionality, the test won't change
            // It only knows the PUBLIC interface: login(user, pass) - Only knows how to interact
            driver.get("https://practicetestautomation.com/practice-test-login/");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("student", "Password123");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}