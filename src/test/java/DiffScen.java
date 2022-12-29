import DemoQA.DiffScenario;
import io.cucumber.java.en.Given;

public class DiffScen {
    DiffScenario val = new DiffScenario();
    @Given("Click on Login")
    public void clickOnLogin() {
        val.MultipleScen();
    }

    @Given("Click on TextBox")
    public void clickOnTextBox() {
        val.EltsTextBox();
    }
}
