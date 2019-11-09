package finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BaseClass {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://aviasales.ru");
    }

    private WebElement departureField() {
        var departureField = wait.until(x -> driver.findElement(By.id("origin")));
        return departureField;
    }

    public void setDepartureLocation(String departureLocation) throws InterruptedException {
        departureField().click();
        departureField().sendKeys(departureLocation);
    }

    private WebElement destinationField() {
        var destinationField = driver.findElement(By.id("destination"));
        return destinationField;
    }

    public void setDestinationLocation(String destinationLocation) throws InterruptedException {
        destinationField().click();
//        wait(1000);
        destinationField().sendKeys(destinationLocation);
    }

    private WebElement departureDateField() {
        var departureDateField = wait.until(x -> driver.findElement(By.id("departDate")));
        return departureDateField;
    }

    private WebElement returnDateField() {
        var returnDateField = wait.until(x -> driver.findElement(By.id("returnDate")));
        return returnDateField;
    }

    private WebElement calendarMonthTab() {
        var calendarMonthTab = driver.findElement(By.xpath("//a[@class='date-tabs__tab']"));
        return calendarMonthTab;
    }

    private WebElement monthSelector(String month) {
        var monthSelector = driver.findElement(By.xpath("//*[@class='monthpicker-month__name'and contains(text()," + month + ")]"));
        return monthSelector;
    }

    private WebElement submitMonthButton() {
        var submitMonthButton = driver.findElement(By.xpath("//*[@class='monthpicker-month__name'and contains(text(),'Выбрать')]"));
        return submitMonthButton;
    }

    public void setMonth(String month) throws InterruptedException {
        calendarMonthTab().click();
        monthSelector(month).click();
        wait(1000);
        submitMonthButton().click();
    }

    private WebElement dateSelector(int date) {
        var dateSelector = driver.findElement(By.xpath("//*[contains(@class,'daypicker__day') and contains(text(),'" + date + "')]"));
        return dateSelector;
    }

    public void setDepartureDate(int date) throws InterruptedException {
        departureDateField().click();
        System.out.println("Departure field clicked");
        dateSelector(date).click();
        System.out.println("Departure date selected");
    }

    public void setReturnDate(int date)  {
        dateSelector(date).click();
        System.out.println("Return date selected");
    }

    public WebElement noReturnDateButton() {
        var noReturnDateButton = wait.until(x -> driver.findElement(By.xpath("//*[@class='return-clear']")));
        return noReturnDateButton;
    }

    public void selectNoReturnDate() throws InterruptedException {
        Thread.sleep(1000);
        noReturnDateButton().click();
    }

    public WebElement showHotelsCheckbox() {
        var showHotelsCheckbox = wait.until(x -> driver.findElement(By.xpath("//*[@class='of_input_checkbox__label']")));
        return showHotelsCheckbox;
    }

    public void dontShowHotels() {
        showHotelsCheckbox().click();
    }


    private WebElement classAndPassengersField() {
        var classAndPassengersField = wait.until(x -> driver.findElement(By.xpath("(//*[contains(@class,'additional-fields__label')])[2]")));
        return classAndPassengersField;
    }

    public void selectClassAndPassengersField() {
        classAndPassengersField().click();
    }

     //passenger Взрослые
    private WebElement adultPassengerSelector () {
        var passengerSelector = wait.until(x-> driver.findElement
                (By.xpath("(//*[contains(@class,'additional-fields__passenger-control --increment')])[1]")));
        return passengerSelector;
    }
    //passenger Дети
    private WebElement childPassengerSelector () {
        var childPassengerSelector = wait.until(x-> driver.findElement
                (By.xpath("(//*[contains(@class,'additional-fields__passenger-control --increment')])[2]")));
        return childPassengerSelector;
    }

    public void addAdultPassenger () {
        adultPassengerSelector().click();
    }

    public void addChildPassenger () {
        childPassengerSelector().click();
    }

    private WebElement classSelector (String airClass) {
        var classAndPassangersField = wait.until(x->driver.findElement
                (By.xpath("//*[@class='custom-radio__caption' and contains (text(), '"+airClass+"')]")));
        return classAndPassangersField;
    }



    public void setClass (String airclass) throws InterruptedException {
        classAndPassengersField().click();
        Thread.sleep(1000);
        classSelector(airclass).click();
    }

    private WebElement findTicketsButton () {
        var findTicketsButton = wait.until(x->driver.findElement
                (By.xpath("(//button[@type='submit'])[2]")));
        return findTicketsButton;
    }

    public void submitFindTickets () {
        findTicketsButton().click();
    }

    private boolean displayNoResults(){
        return wait.until(x->driver.findElement(By.xpath("//*[@class='error-informer']")).isDisplayed());
    }

    public boolean areNoResultsDisplayed() {
        return displayNoResults();
    }











    }



