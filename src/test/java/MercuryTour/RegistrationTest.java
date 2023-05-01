package MercuryTour;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.w3c.dom.DOMConfiguration;

//import java.security.Provider;
import java.util.concurrent.TimeUnit;



// All the information used on this page are stricty for testing purposes and there are not real details
public class RegistrationTest {

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark =  new ExtentSparkReporter("Extentreport.html");
    WebDriver driver;
    Logger logger = (Logger) LogManager.getLogger(RegistrationTest.class);
    @Test
    public void verfiyFlightReg() {
        ChromeOptions options = new ChromeOptions();
        ExtentTest test = extent.createTest("Launch Browser and website");
        test.pass("Browser Launched Successfully");
        ChromeOptions option = new ChromeOptions();
        option.setHeadless(false);
        driver = WebDriverManager.chromedriver().capabilities(option).create();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        Faker faker = new Faker();
        logger.info("open browser");
        driver.get("https://demo.guru99.com/selenium/newtours/");
        RegistrationPage REGPAGE = new RegistrationPage(driver);
        logger.info("click on register");
        REGPAGE.clickreglink();
        logger.info("add first name");
        REGPAGE.setFirstName("");
        logger.info("add last name");
        REGPAGE.setLastName("");
        logger.info("enter email");
        REGPAGE.setEmail("");
        logger.info("enter address");
        REGPAGE.setAddress("");
        logger.info("Enter Phone number");
        REGPAGE.setPhone("");
        logger.info("Enter State");
        REGPAGE.setState("");
        logger.info("Enter password");
        REGPAGE.setPassword("");
        logger.info("Enter Country");
        REGPAGE.setCountry("");
        logger.info("Enter Postal code");
        REGPAGE.setPostalCode("");
        logger.info("Enter confirm password");
        REGPAGE.setConfirmPassword("");
        logger.info("Enter City");
        REGPAGE.setCity("");
        logger.info("Enter User name");
        REGPAGE.setUserName("");
        logger.info("Submit");
        REGPAGE.Submitbtn();
    }
    @BeforeTest
    public void beforeTest() {
        extent.attachReporter(spark);
    }
    @AfterTest
    public void teardown(){
        extent.flush();
        driver.quit();
    }

}
