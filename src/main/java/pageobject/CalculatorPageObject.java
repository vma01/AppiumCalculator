package pageobject;

import static enums.MathOperations.MINUS;
import static enums.MathOperations.PLUS;

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
	private By zero = By.xpath("//android.widget.Button[@text='0']");
	private By div = By.id(appPkg + "op_div");
	private By formula = By.id(appPkg + "formula");
	private By result = By.id(appPkg + "result");
	private By sin = By.id(appPkg + "fun_sin");
	private By equals = By.id(appPkg + "eq");
	private By rightParenthesis = By.id(appPkg + "rparen");

	public CalculatorPageObject(AppiumDriver driver) {
		this.driver = driver;
	}

	public WebElement zeroButton() {
		return driver.findElement(zero);
	}

	public void clickOnDigitButton(int digit) {
		String[] buttons = String.valueOf(digit).split("");
		for (String button : buttons) {
			driver.findElement(By.id(appPkg + "digit_" + button)).click();
		}
	}

	public void clickOnMathOperation(MathOperations mathOperation) {
		driver.findElement(By.id(appPkg + mathOperation.getId())).click();
	}


	public WebElement formulaEditText() {
		return driver.findElement(formula);
	}
	public WebElement equalButton() {
		return driver.findElement(equals);
	}

	public WebElement rightParenthesisButton() {
		return driver.findElement(rightParenthesis);
	}

	public WebElement resultView() {
		return driver.findElement(result);
	}
}
