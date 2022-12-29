import DemoQA.Date;
import io.cucumber.java.en.Given;

public class MyDate {
    Date obj = new Date();
    @Given("Click on date")
    public void clickOnDate() throws Exception {
        obj.Launch();
        obj.Widgets();
    }
}
