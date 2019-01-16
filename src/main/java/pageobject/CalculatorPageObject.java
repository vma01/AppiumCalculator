package pageobject;

import java.util.List;

import enums.MathOperations;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by v.matviichenko
 */
public class CalculatorPageObject extends MainScreen {
	private String appPkg = "com.android.calculator2:id/";
	private By result = By.id(appPkg + "result");
	private By equals = By.id(appPkg + "eq");
	private final By advancedPad = By.id("pad_advanced");
	private final By history = By.id("history_formula");

	public CalculatorPageObject(AndroidDriver<MobileElement> driver) {
		super(driver);
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
		MobileElement resultPad = driver.findElement(result);
		actionController.swipeElement(resultPad);
	}

	public List<MobileElement> getHistory() {
		List<MobileElement> elements = driver.findElements(history);
		return elements;
	}
}
