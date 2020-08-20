import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/georgeashraf/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("George");
        Thread.sleep(1000);

        driver.findElement(By.id("last-name")).sendKeys("Ashraf");
        Thread.sleep(1000);

        driver.findElement(By.id("job-title")).sendKeys("Software QA");
        Thread.sleep(1000);

        driver.findElement(By.id("radio-button-2")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("option[value='3']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("datepicker")).sendKeys("08/20/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();





        //driver.quit();
    }
}
