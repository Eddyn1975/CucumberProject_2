package steps;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.DashboardPage;
import page.WhitebackgroundchangePage;
import util.BrowserFactory;

public class WhitebackgroundSteps {
	WebDriver driver;
	DashboardPage dashboard;
	WhitebackgroundchangePage whitebackgroundpage;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		dashboard = PageFactory.initElements(driver, DashboardPage.class);
		whitebackgroundpage = PageFactory.initElements(driver, WhitebackgroundchangePage.class);

		// Dashboard validation

		dashboard.dashboardValidation();
	}

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String arg1) {
		whitebackgroundpage.existsElement();
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		whitebackgroundpage.clickOnTheSetWhiteBackgroundButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		whitebackgroundpage.validateWhiteBackgroungChangeColor();
	}

	@After
	public void close() throws InterruptedException {
		BasePage.waitForImplicitWaitly();
		driver.close();
		driver.quit();
	}
}