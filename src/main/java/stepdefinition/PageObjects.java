package stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	WebDriver driver;

	public PageObjects(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name="username")

    WebElement userName;
	
	@FindBy(name="password")

    WebElement password;
	
	@FindBy(xpath="//button[contains(.,'Login')]")

    WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")

    WebElement flightsLink;
	
	@FindBy(id="s2id_autogen3")

    WebElement fromLocationObject;
	
	@FindBy(id="s2id_autogen4")

    WebElement toLocationObject;

	@FindBy(xpath="//button[@class='btn-primary btn btn-block']")

    WebElement searchButton;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block theme-search-results-item-price-btn']")

    List<WebElement> bookNowButton;
	
	@FindBy(xpath="//input[@type='checkbox']")

	WebElement agreeTermsAndConditions;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block completebook upClick']")

	WebElement completeBookingButton;
	
	@FindBy(xpath="//strong[contains(text(),'Booking Number')]")

	WebElement bookingNumber;
	
	
}
