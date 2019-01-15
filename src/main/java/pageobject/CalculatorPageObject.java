package pageobject;

import enums.MathOperations;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by v.matviichenko
 */
public class CalculatorPageObject {
	private AppiumDriver driver;

	private String appPkg = "com.android.calculator2:id/";
	private By result = By.id(appPkg + "result");
	private By equals = By.id(appPkg + "eq");
	private final By advancedPad = By.id("pad_advanced");

	public CalculatorPageObject(AppiumDriver driver) {
		this.driver = driver;
	}

	public void clickOnDigitButton(int digit) {
		String[] buttons = String.valueOf(digit).split("");
		for (String button : buttons) {
			driver.findElement(By.id(appPkg + "digit_" + button)).click();
		}
	}

	public void selectMathOperation(MathOperations mathOperation) {
		driver.findElement(By.id(appPkg + mathOperation.getId())).click();
	}

	public void selectAdvancedOptions() {
		driver.findElement(advancedPad).click();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void clickOnEqualButton() {
		driver.findElement(equals).click();
	}

	public void clickOnParenthesisButton(MathOperations mathOperation) {
		driver.findElement(By.id(appPkg + mathOperation.getId())).click();
	}

	public WebElement resultView() {
		return driver.findElement(result);
	}

	public void openHistory() {
//		MobileElement resultPad = driver.findElement(result);
//		gesturesController.swipeInsideElement(Direction.DOWN, resultPad);
	}
}
