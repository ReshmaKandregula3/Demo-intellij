import DemoQA.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
//import io.cucumber.java.en.Then;

public class MyStepdefs {
    Elements obj = new Elements();

    @Given("Go to demoqa.com {string} and {string}")
    public void goToDemoqaComAnd(String Username, String Pswd) throws InterruptedException {
        obj.Main(Username,Pswd);

    }

    @When("Click On TextBox {string} {string} {string} {string}")
    public void clickOnTextBox(String FullName,String Email,String CurrAdd,String PermAdd) throws InterruptedException {
//        obj.BookElt(FullName,Email,CurrAdd,PermAdd);
//        obj.Checkbox();
//        obj.RadioBtn();
//        obj.WebElt();
//        obj.Buttons();
//        obj.Links();
//        obj.UploadDown();
    }

    @Then("Go to Frames")
    public void goToFrames() {

    }


//    @Then("Click On TextBox {string} {string} {string} {string}")
//    public void clickOnTextBox(String FullName,String Email,String CurrAdd,String PermAdd) throws InterruptedException {
//        obj.BookElt(FullName,Email,CurrAdd,PermAdd);
//        obj.Checkbox();
//        obj.RadioBtn();
//        obj.WebElt();
//        obj.Buttons();
//        obj.Links();
//        obj.UploadDown();
//    }
}
