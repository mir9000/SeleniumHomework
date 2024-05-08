import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxHw {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("Omar");
        Thread.sleep(2000);

        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Sayed");
        Thread.sleep(2000);

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("OmarSayed@syntax.com");
        Thread.sleep(2000);

        WebElement submitButton= driver.findElement(By.id("submit_button"));
        submitButton.click();

        WebElement link= driver.findElement(By.linkText("Click Here."));
        link.click();

        WebElement linkButton = driver.findElement(By.linkText("Link"));
        linkButton.click();

    }
}

