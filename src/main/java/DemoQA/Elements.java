package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Elements {
    WebDriver driver;
    String prntWin;

    public void Main(String Username,String Pswd) throws InterruptedException{
        /* Configure the driver    */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\RKANDREG\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        /*  Launching web browser   */
        driver = new ChromeDriver();
        /*  Maximize window */
        driver.manage().window().maximize();
        /*   launching website */
        driver.get("https://demoqa.com/books");
//        Login
        /* Find the element */
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("userName")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Pswd);

//        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();

    }
    /*  ********************************************************************************************************************************  */

    public void BookElt(String FullName,String Email,String CurrAdd,String PermAdd ) throws InterruptedException{
        driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(FullName);
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(Email);
        driver.findElement(By.id("currentAddress")).sendKeys(CurrAdd);
        driver.findElement(By.id("permanentAddress")).sendKeys(PermAdd);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[5]/div")).click();
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        WebElement val = driver.findElement(By.xpath("//*[@id=\"output\"]/div"));
        System.out.println("Text box: \n"+val.getText());
    }
    /*  ********************************************************************************************************************************  */

        /* checkbox */
    public void Checkbox() throws InterruptedException {
//        driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
        driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
        driver.findElement(By.className("rct-checkbox")).click();

//        System.out.println(driver.findElement(By.className("text-success")).getText());
        WebElement elt = driver.findElement(By.className("text-success"));
        System.out.println("Check box: \n"+elt.getText());
        Thread.sleep(3000);
    }
    /*  ********************************************************************************************************************************  */

    public void RadioBtn() throws InterruptedException {
        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
        WebElement item = driver.findElement(By.className("text-success"));
        System.out.println("Radio button: "+item.getText());
        Thread.sleep(3000);

    }
    /*  ********************************************************************************************************************************  */

    public void WebElt() throws InterruptedException {
        driver.findElement(By.xpath("(//li[@id='item-3'])[1]")).click();
        Thread.sleep(3000);

//        driver.findElement(By.id("addNewRecordButton")).click();

//        prntWin = driver.getWindowHandle();
//        System.out.println(prntWin);
//
//        Set<String> WindowHandles = driver.getWindowHandles();
//
//        for (String ChildWin: WindowHandles) {
//            if (!prntWin.equals(ChildWin)) {
//                driver.switchTo().window(ChildWin);

//                driver.findElement(By.id("(//input[@id='firstName'])[1]")).sendKeys(Firstname);
//                driver.findElement(By.id("(//input[@id='lastName'])[2]")).sendKeys(Lastname);
//                driver.findElement(By.id("(//input[@id='userEmail'])[3]")).sendKeys(UserEmail);
////        driver.findElement(By.id("(//input[@id='age'])[4]")).sendKeys(Age);
////        driver.findElement(By.id("(//input[@id='salary'])[5]")).sendKeys(Salary);
//                driver.findElement(By.id("(//input[@id='department'])[6]")).sendKeys(Department);
//                driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[7]/div")).click();

//            }
//        }
//        WebElement prntval =driver.findElement(By.className("rt-tr-group"));
        WebElement prntval =driver.findElement(By.className("rt-table"));
        System.out.println("web Table: "+prntval.getText());
    }
    /*  ********************************************************************************************************************************  */

    public void Buttons() throws InterruptedException {
        driver.findElement(By.xpath("(//li[@id='item-4'])[1]")).click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);

        /* Double click on element */
        WebElement dbl = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(dbl).perform();
        Thread.sleep(3000);
        WebElement msg = driver.findElement(By.xpath("(//p[@id='doubleClickMessage'])"));
        System.out.println("Button msg: "+msg.getText());


//        /*  Right Click */
        Thread.sleep(3000);
        WebElement rytClk = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rytClk).perform();
        Thread.sleep(3000);
        WebElement rytmsg = driver.findElement(By.xpath("(//p[@id='rightClickMessage'])"));
        System.out.println("RightBtn msg: "+rytmsg.getText());


        /*  Single Click */
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
        Thread.sleep(3000);
        WebElement Sngl = driver.findElement(By.xpath("(//p[@id='dynamicClickMessage'])"));
        System.out.println("SingleBtn msg: "+Sngl.getText());
    }
    /*  ********************************************************************************************************************************  */

    public void Links() throws InterruptedException {
        driver.findElement(By.xpath("(//li[@id='item-5'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("simpleLink")).click();

        prntWin = driver.getWindowHandle();
        System.out.println(prntWin);

        Set<String> WindowHandles = driver.getWindowHandles();

        for (String ChildWin: WindowHandles) {
            if (!prntWin.equals(ChildWin)) {
                driver.switchTo().window(ChildWin);
                Thread.sleep(2000);
                driver.close();
//                driver.findElement(By.id("dynamicLink")).click();
//        driver.navigate().back();
            }
        }
        driver.switchTo().window(prntWin);


    }
    /*  ********************************************************************************************************************************  */

    public void UploadDown() throws InterruptedException {
//        driver.switchTo().window(prntWin);
        driver.findElement(By.xpath("(//li[@id='item-7'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("downloadButton")).click();
        driver.findElement(By.xpath("//*[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\RKANDREG\\Downloads\\sampleFile.jpeg");
//        driver.close();
    }
}

/*  ********************************************************************************************************************************  */

