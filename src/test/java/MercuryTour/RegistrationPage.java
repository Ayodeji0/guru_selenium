package MercuryTour;


import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {
    WebDriver driver;

    Faker faker = new Faker();

    RegistrationPage(WebDriver d){
        driver = d;
        PageFactory.initElements(d, this);
    }

//    identification of elements
    @FindBy(xpath = " //a[normalize-space()='REGISTER']") WebElement Reglink;
    @FindBy(xpath = "//input[@name='firstName']") WebElement FirstName;
    @FindBy(xpath = "//input[@name='lastName']") WebElement LastName;
    @FindBy(xpath = "//input[@name='phone']") WebElement Phone;
    @FindBy(xpath = "//input[@id='userName']") WebElement UserName;
    @FindBy(xpath = "//input[@name='address1']") WebElement Address;
    @FindBy(xpath = "//input[@name='city']") WebElement City;
    @FindBy(xpath = "//input[@name='state']") WebElement State;
    @FindBy(xpath = "//input[@name='postalCode']") WebElement PostalCode;
    @FindBy(xpath = "//select[@name='country']") WebElement Country;
    @FindBy(xpath = "//input[@id='email']") WebElement Email;
    @FindBy(xpath = "//input[@name='password']") WebElement Password;
    @FindBy(xpath = "//input[@name='confirmPassword']") WebElement ConfirmPassword;
    @FindBy(xpath = "//input[@name='submit']") WebElement Submitbtn;



//    Methods for the identified Webelement
    public void clickreglink() {
        Reglink.click();
    }

    public void setFirstName(String fName) {

        FirstName.sendKeys(faker.name().firstName());
    }

    public void setLastName(String lName) {
        LastName.sendKeys(faker.name().lastName());
    }

    public void setPhone(String ph) {
        Phone.sendKeys(faker.phoneNumber().phoneNumber());
    }

    public void setUserName(String user) {
        UserName.sendKeys(faker.internet().emailAddress());
    }

    public void setAddress(String address) {
        Address.sendKeys(faker.address().fullAddress());
    }

    public void setCity(String city) {
        City.sendKeys(faker.address().city());
    }

    public void setState(String state) {
        State.sendKeys(faker.address().state());
    }

    public void setPostalCode(String code) {
        PostalCode.sendKeys(faker.address().zipCode());
    }

    public void setCountry(String country) {
        Country.sendKeys(faker.address().country());
    }

    public void setEmail(String email) {
        Email.sendKeys(faker.internet().emailAddress());
    }

    public void setPassword(String password) {
        Password.sendKeys(faker.internet().password());
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword.sendKeys(faker.internet().password());
    }
    public void Submitbtn() {
        Submitbtn.click();
    }
}



//    public void setLastName(String lName) {
//        LastName.sendKeys(lName);
//    }

//    public void setPhone(String ph) {
//        Phone.sendKeys(ph);
//    }

//    public void setUserName(String user) {
//        UserName.sendKeys(user);
//    }

//    public void setAddress(String address) {
//        Address.sendKeys(address);
//    }
//
//    public void setCity(String city) {
//        City.sendKeys(city);
//    }
//
//    public void setState(String state) {
//        State.sendKeys(state);
//    }
//
//    public void setPostalCode(String code) {
//        PostalCode.sendKeys(code);
//    }
//
//    public void setCountry(String country) {
//        Country.sendKeys(country);
//    }
//
//    public void setEmail(String email) {
//        Email.sendKeys(email);
//    }
//
//    public void setPassword(String password) {
//        Password.sendKeys(password);
//    }
//
//    public void setConfirmPassword(String confirmPassword) {
//        ConfirmPassword.sendKeys(confirmPassword);
//
//    }





