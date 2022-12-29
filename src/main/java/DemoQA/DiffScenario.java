package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffScenario {
    WebDriver driver;
    String Username ="Minnu";
    String Pswd = "Loading90%";
    public void MultipleScen(){
        System.setProperty("webdriver.chrome.driver","C:\\chrome109\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
    }
    public void EltsTextBox(){
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("userName")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Pswd);

        driver.findElement(By.id("login")).click();
    }


}
