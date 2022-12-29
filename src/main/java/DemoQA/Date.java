package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    WebDriver driver;
    public void Launch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\RKANDREG\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
    }
    public void Widgets() throws Exception {
//        driver.findElement(By.id("first_date_picker")).click();
//        driver.fin
//        driver.findElement(By.className("ui-datepicker-prev ui-corner-all")).click();
//        WebElement first = driver.findElement(By.id("ui-datepicker-div"));
//        for (WebElement one:first) {
//            if((one.getText()).equalsIgnoreCase("28")){
//                one.click();
//                break;
//            }
//        }
//        WebElement first = driver.findElement(By.id("first_date_picker"));
//        first.sendKeys("08/15/1947");
//        WebElement second = driver.findElement(By.id("second_date_picker"));
//        second.sendKeys("08/15/1947");
//        WebElement third = driver.findElement(By.id("third_date_picker"));
//        third.sendKeys("08/15/1947");
//        WebElement fourth = driver.findElement(By.id("fourth_date_picker"));
//        fourth.sendKeys("08/15/1947");
//        WebElement fifth = driver.findElement(By.id("fifth_date_picker"));
//        fifth.sendKeys("08/15/1947");
//        WebElement sixth = driver.findElement(By.id("sixth_date_picker"));
//        sixth.sendKeys("08/15/1947");

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MMM");
//
//        java.util.Date newdate;
//        try {
//            newdate = dateFormat.parse(dates);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        int day = 23;
//        driver.findElement(By.id("first_date_picker")).click();
//        driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])//a[text()="+day+"]")).click();

        int day1 = 30;
        driver.findElement(By.id("second_date_picker")).click();
        driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])//td[not(contains(@class,'ui-datepicker-other-month'))]//a[text()="+day1+"]")).click();

        String dates = "2022-31-July";
        Calendar cal = Calendar.getInstance();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MMM");
            dateFormat.setLenient(false);
            java.util.Date newDate = dateFormat.parse(dates);
            cal.setTime(newDate);

            int addDay = cal.get(Calendar.DAY_OF_MONTH);
            int addMon = cal.get(Calendar.MONTH);
            int addYear = cal.get(Calendar.YEAR);

            driver.findElement(By.id("first_date_picker")).click();
            String AnotherDate = driver.findElement(By.className("ui-datepicker-title")).getText();
//            SimpleDateFormat nextDateFormat = new SimpleDateFormat("yyyy-MMM");
//            nextDateFormat.setLenient(false);
            java.util.Date nextDate = (new SimpleDateFormat("yyyy-MMM").parse(AnotherDate));
            cal.setTime(nextDate);

            int nextDay = cal.get(Calendar.DAY_OF_MONTH);
            int nextMon = cal.get(Calendar.MONTH);
            int nextYear = cal.get(Calendar.YEAR);



        } catch (ParseException e) {
           throw new Exception("Invalid input");
        }
    }

}
