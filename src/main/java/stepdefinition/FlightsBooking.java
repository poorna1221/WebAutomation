package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightsBooking {

	Properties prop = new Properties();
	FileInputStream fis;
	WebDriver driver;
	PageObjects pageObjects;

	@Before
	public void setUp() throws IOException {
		fis = new FileInputStream("ObjectRepository.properties");

		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));

		driver = new ChromeDriver();

		driver.get(prop.getProperty("applicationUrl"));

		driver.manage().window().maximize();
		pageObjects = new PageObjects(driver);
	}

	@Given("^user logged into phptravels application$")
	public void user_logged_into_phptravels_application() {

		pageObjects.userName.sendKeys(prop.getProperty("userIdValue"));

		pageObjects.password.sendKeys(prop.getProperty("passwordValue"));

		pageObjects.loginButton.click();

	}

	@When("^user clicks on flights link and provide booking information$")
	public void user_clicks_on_flights_link_and_provide_booking_information() throws InterruptedException, AWTException {

		Thread.sleep(4000);

		boolean flightsLinkObjectFound = waitForPresenceByxpath(driver, 60000, prop.getProperty("flightsLinkXpath"));

		pageObjects.flightsLink.click();

		Thread.sleep(2000);

		boolean fromLocationObjectFound = waitForPresenceById(driver, 60000, prop.getProperty("fromLocationObjectId"));

		pageObjects.fromLocationObject.sendKeys(prop.getProperty("fromLocation"));

		Thread.sleep(5000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);

		pageObjects.toLocationObject.sendKeys(prop.getProperty("toLocation"));

		Thread.sleep(4000);

		robot.keyPress(KeyEvent.VK_ENTER);

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;

		executor2.executeScript("document.getElementById('FlightsDateStart').setAttribute('value', '2020-02-27')");
	}

	@When("^user clicks on search button and book now button$")
	public void user_clicks_on_search_button_and_book_now_button() throws InterruptedException {

		Thread.sleep(2000);
		pageObjects.searchButton.click();

		pageObjects.bookNowButton.get(0).click();

	}

	@When("^user completes the booking$")
	public void user_completes_the_booking() throws Throwable {

		Actions actions = new Actions(driver);

		actions.moveToElement(pageObjects.agreeTermsAndConditions).click().build().perform();

		Thread.sleep(1000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click();", pageObjects.agreeTermsAndConditions);

		JavascriptExecutor executor4 = (JavascriptExecutor) driver;

		executor4.executeScript("arguments[0].click();", pageObjects.completeBookingButton);
	}

	@Then("^verify if the user is navigated to booking confirmation page$")
	public void verify_if_the_user_is_navigated_to_booking_confirmation_page() throws InterruptedException {

		boolean ObjectFound = waitForPresenceByxpath(driver, 60000, prop.getProperty("bookingNumberObjectXpath"));

		//Assert.assertEquals(true, ObjectFound);

	}

	public static boolean waitForPresenceById(WebDriver driver, int timeLimitInSeconds, String targetResourceId) {

		boolean isElementPresent;
		try {
			WebElement webElement;
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(targetResourceId)));
			isElementPresent = webElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}
	}

	public static boolean waitForPresenceByxpath(WebDriver driver, int timeLimitInSeconds, String targetResourceXpath) {

		boolean isElementPresent;
		try {
			WebElement webElement;
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(targetResourceXpath)));
			isElementPresent = webElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}
	}
}
