import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class FlightBookingValidationTestClass {

    /*

    Description : A person wants to check for the round-trip flights from San Francisco(SFO) to Orlando,FL(MCO) for 1 passenger
                  on booking.com portal for the 16th April and 22nd April and make sure layover city, Date, filling dates and time
                  in depart and return flight. Automate the same using
                  (https://www.booking.com/) portal.

Automation Steps :

1.Launch the browser with “https://www.booking.com/ ”
2.Select Flights form homepage
3.check round-trip radio button
4.Select  Flight Departure Airport : SFO
5.Select Flight Arrival Airport : Orlando,FL (MCO)
6.Click Flight Date Range :'04/16/2020 – 04/22/2020'
7.Select 1 Adult
8.Select Cabin Class: Economy
9.Click find your flight button (will navigate to flight details page)
10.Validate all Departure and Return Information (layover city, time-duration, etc )
 */



    static WebDriver driver;
    private static String url = "https://www.booking.com/";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        logInfo("Start chrome browser");
        driver = new FirefoxDriver();

        logInfo("Set the page load timeout for any page load");
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        logInfo("Navigate to url : " + url);
        driver.navigate().to(url);

        logInfo("Maximize window");
        driver.manage().window().maximize();
    }


    @Test
    public void testFlightBookingBasicValidationScenario() {

        JavascriptExecutor js = (JavascriptExecutor) driver;


        logInfo("Set implicit wait for all the activities on the browser");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        logInfo("Set selenium script timeout");
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        logInfo("Execute any asynchronous script");
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");

        logInfo("Select Flights");
        FindElement(driver, By.xpath("//span[text()='Flights']"), 4).click();
        sleepPause(1200);


        logInfo("Select Round-Trip");
        FindElement(driver, By.xpath("//input[@type='radio'][@name='tripType']"), 4).click();
        sleepPause(1200);

        logInfo("Select  Flight Departure Airport : SFO ");
        FindElement(driver, By.xpath("//input[@type='text'][@id='flight-departure-airport0']"), 4).sendKeys("SFO");
        FindElement(driver, By.xpath("//div[contains(text(),'San Francisco, CA (SFO)')]"), 4).click();

        logInfo("Select Flight Arrival Airport : Orlando,FL (MCO)");
        FindElement(driver, By.xpath("//input[@type='text'][@id='flight-arrival-airport0']"), 4).sendKeys("MCO");
        FindElement(driver, By.xpath("//div[contains(text(),'Orlando, FL (MCO)')]"), 4).click();
        sleepPause(1200);


        logInfo("Click Flight Date Range :'04/16/2020 – 04/22/2020'");
        WebElement flightDateRange = driver.findElement(By.xpath("//input[@class='sc-hgHYgh hjXxSf']"));
        flightDateRange.click();
        js.executeScript("document.getElementsByClassName('sc-hgHYgh hjXxSf').readOnly = false", flightDateRange);
        FindElement(driver,By.xpath("//input[@class='sc-hgHYgh hjXxSf']"), 4).sendKeys("04/16/2020 – 04/22/2020");

          sleepPause(1200);

        logInfo("Select 1 Adult ");
        FindElement(driver, By.xpath("//text()[.='1 Adult']/ancestor::button[1]"), 4).click();

        sleepPause(1200);
        FindElement(driver, By.xpath("//button[text()='Done']"), 4).click();

        sleepPause(1200);

        logInfo("Select  Cabin Class : Economy");
        FindElement(driver, By.xpath("//select[@name='cabinClass']"), 4).click();

        sleepPause(1200);

        logInfo("Click find your flight button ");
        FindElement(driver, By.xpath("//button[text()='Find your flight']"), 4).click();
        sleepPause(1200);



        List<WebElement> allDivElements = driver.findElements(By.cssSelector("div[class='Itinerary__MainZone-sc-1wk5vhu-5 dDYUCr Itinerary__Zone-sc-1wk5vhu-1 kExWfV sc-ipXKqB cPuyPz sc-kUaPvJ kicIIN']"));

        for(int i=0; i<allDivElements.size();i++){

            WebElement thirdDiv = allDivElements.get(2).findElement(By.xpath("div[class='Itinerary__MainZone-sc-1wk5vhu-5 dDYUCr Itinerary__Zone-sc-1wk5vhu-1 kExWfV sc-ipXKqB cPuyPz sc-kUaPvJ kicIIN']"));
            logInfo("Select third div ");

            thirdDiv.click();
            break;
        }


        //hard-coded assertions :

        logInfo("validate departure information text ");
        Assert.assertEquals(driver.getPageSource().contains("Departure Information"),"Departure Information" );
        logInfo("validate departure date :Thursday, April 16 ");
        Assert.assertEquals(driver.getPageSource().contains("departure -date"),"Thursday, April 16" );
        logInfo("validate departure city : San francisco ");
        Assert.assertEquals(driver.getPageSource().contains("departure-city"),"San francisco" );
        logInfo("validate arrival city : Orlando, FL");
        Assert.assertEquals(driver.getPageSource().contains("arrival-city"),"Orlando, FL" );
        logInfo("validate departure layover in city : Las Vegas ");
        Assert.assertEquals(driver.getPageSource().contains("departure layover in city"),"Las Vegas" );
        logInfo("validate departure layover duration : 1 Stop - 1h 11m ");
        Assert.assertEquals(driver.getPageSource().contains("departure layover duration"),"1 Stop - 1h 11m " );



      logInfo("validate Return Information text ");
      Assert.assertEquals(driver.getPageSource().contains("Return Information "),"Return Information" );
      logInfo("validate return date : Wednesday, April 22");
      Assert.assertEquals(driver.getPageSource().contains("Return-date"),"Wednesday, April 22" );
      logInfo("validate departure city : Orlando,FL");
      Assert.assertEquals(driver.getPageSource().contains("Departure city"),"Orlando,FL" );
      logInfo("validate arrival city : San Francisco");
      Assert.assertEquals(driver.getPageSource().contains("arrival city"),"San Francisco" );
      logInfo("validate return layover in city : Newark,NJ ");
      Assert.assertEquals(driver.getPageSource().contains("return layover in city"),"Newark,NJ" );
      logInfo("validate return layover duration : 1 Stop - 1h 4m ");
      Assert.assertEquals(driver.getPageSource().contains("return layover duration"),"1 Stop - 1h 4m" );

    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {

        logInfo("Closing chrome");
        driver.quit();
        logInfo("DONE!");
    }

    public static void sleepPause(int ms) {

        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            logInfo("Exception : " + e.toString() );
        }

    }

    private static WebElement FindElement(WebDriver driver, By by, int timeoutInSeconds) {

        try {

            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            logInfo( "FindElement *** " + by + " *** Found");
            return driver.findElement(by);

        } catch (Exception e) {
            e.printStackTrace();
        }

        logInfo( "FindElement --> " + by + " --> Not found");
        return null;
    }

    public static void logInfo(String msg) {

        System.out.println( LocalDateTime.now() + " : " + msg );

    }









}





