package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhitebackgroundchangePage {
	WebDriver driver;

	public WhitebackgroundchangePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='advance-controls']//descendant::button[contains(text(),'Set White Background')]")
	WebElement SET_WHITE_BACKGROUND_BUTTON;

	// Methods to interact with the elements

	public void existsElement() {
		if (!driver.findElements(By.xpath("//div[@class='advance-controls']//descendant::button[contains(text(),'Set SkyBlue Background')]")).isEmpty()) {
			System.out.println("Element is present ");
		} else {
			System.out.println("Element is not present ");
		}
	}
	
	public void clickOnTheSetWhiteBackgroundButton() {
		SET_WHITE_BACKGROUND_BUTTON.click();
	}

	public void validateWhiteBackgroungChangeColor() {

		WebElement element = driver.findElement(By.xpath("//body[@style='background-color: white;']"));
		String Color = element.getCssValue("color");
		// String hex = Color.substring(Color).asHex();
		// System.out.println(hex);
		System.out.println(Color);
		String backgroundColor = element.getCssValue("background-color");
		System.out.println(backgroundColor);
	}
}