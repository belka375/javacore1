package finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestingAviasales extends BasicTest {

   @Test

   //Los Angeles - New York. Туда и обратно. 2 взрослых. Бизнес класс. Результаты в новом окне.

    public void findTicketsFromAviasales () throws InterruptedException {
       LandingPage landingPage = new LandingPage(driver);
       landingPage.open();
       Thread.sleep(1000);
       landingPage.setDepartureLocation("Los Angeles");
       landingPage.setDestinationLocation("New York");
       landingPage.setDepartureDate(15);
       landingPage.setReturnDate(25);
       Thread.sleep(1000);
       landingPage.setClass("Бизнес");
       landingPage.addAdultPassenger();
       landingPage.submitFindTickets();
      Thread.sleep(6000);
      ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
      driver.switchTo().window(tabs2.get(1));
      Assert.assertEquals(driver.getCurrentUrl(), "https://www.aviasales.ru/search/LAX1511NYC2511c2");

   }

   @Test

   //Chicago - Miami. Без обратного билета. 1 взрослый, 1 ребёнок. Комфорт класс. Оставаться в том же окне.

   public void findTicketsOneWay () throws InterruptedException {
      LandingPage landingPage = new LandingPage(driver);
      landingPage.open();
      Thread.sleep(1000);
      landingPage.setDepartureLocation("Chicago");
      landingPage.setDestinationLocation("Miami");
      landingPage.setDepartureDate(15);
      landingPage.selectNoReturnDate();
      Thread.sleep(1000);
      landingPage.setClass("Комфорт");
      landingPage.addChildPassenger();
      landingPage.selectClassAndPassengersField();
      Thread.sleep(2000);
      landingPage.dontShowHotels();
      landingPage.submitFindTickets();
      Thread.sleep(6000);
      Assert.assertTrue(landingPage.areNoResultsDisplayed());

   }

}
