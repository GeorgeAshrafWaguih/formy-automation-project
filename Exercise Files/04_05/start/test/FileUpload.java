import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/georgeashraf/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement uploadField = driver.findElement(By.id("file-upload-field"));
        uploadField.sendKeys("file-to-upload.png");
        Thread.sleep(2000);

        WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
        reset.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
