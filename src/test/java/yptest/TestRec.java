package yptest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestRec {
    private WebDriver driver;

//    https://howtodoinjava.com/testng/testng-before-and-after-annotations/

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    // Вставляем value  в Search Box
    @Test
    public void searchTripIn() throws InterruptedException {
        driver.get("https://deens-master.now.sh");
        Thread.sleep(3000);
        WebElement searchTrip = driver.findElement(By.xpath("//*[@style='overflow: hidden; padding: 2px 0px;']/*"));
        searchTrip.clear();
        Thread.sleep(3000);
        searchTrip.sendKeys("Atlanta");
        searchTrip.sendKeys((Keys.ENTER));
    }

        // Поиск по CSS селектору
        @Test
        public void deens_TryToLoginUsingCssSelectors_loginFailed() throws InterruptedException {
            driver.get("https://deens-master.now.sh/");
            Thread.sleep(2000);

            WebElement loginButton = driver.findElement(By.cssSelector("[href='/login']"));
            loginButton.click();
            Thread.sleep(4000);

            WebElement id = driver.findElement(By.cssSelector("[#email"));
            WebElement password = driver.findElement(By.cssSelector("#password"));
            WebElement login = driver.findElement(By.cssSelector(".ui.large.fluid.button.green-btn.pl-btn"));

            id.sendKeys("user");
            password.sendKeys("password");
            login.click();
        }

        @Test
        public void deens_TryToLoginUsingWrongCredentials_LoginFailed_ErrorMessageAppear () throws InterruptedException {
            driver.get("https://deens-master.now.sh/");
            Thread.sleep(2000);
            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();

            Thread.sleep(5000);

// Находим элементы для теста (login field, password field and Login button
            WebElement id = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement login = driver.findElement(By.className("pl-btn"));
// Вводим неверные данные для логина
            id.sendKeys("user");
            password.sendKeys("password");
            login.click();
// надо убедиться что появится сообщение  can't login
            Thread.sleep(2000);
// через array асертаем, что элемент есть на сранице.
            Assert.assertTrue(driver.findElements(By.className("header")).size() == 1);
            Assert.assertEquals(driver.findElements(By.className("header")).size(), 1);

  /*    Можно сипользовать try catch: (но лучше использовать assert, а не exception)
        var present= false;
        try{
            var x=driver.findElement(By.className("header"));
            present=true;
        } catch(Exception x){
            present=false;
        }
        Assert.assertTrue(present); */
        }


        @Test
        public void searchInGoogle_searchForAcar_carIsFound () {
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.xpath("//*[@maxlength='2048']"));
            searchBox.sendKeys("Car");

            searchBox.sendKeys(Keys.RETURN);
            // ищем машину, клик

//        var searchButton = driver.findElement(By.xpath("//*[@name=btnK])[1]"));
//        searchButton.click();
            //Ищем окно ввода, вводим car и кликаем кнопку, нашли первый элемент среди найденных

//         Можно с помощью array найти все displayed buttons:
            List<WebElement> searchButtons = driver.findElements(By.xpath("//*[@name=btnK][1]"));
            searchButtons.forEach(button -> {
                if (button.isDisplayed()) {
                    button.click();
                }
            });
        }

        @Test
        public void deens_ClickLoginButton_LoginPageOpened () throws InterruptedException {
            //Arrange
            driver.get("https://deens-master.now.sh/");

            //Act
            WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
            loginButton.click();

            //Assert
            Thread.sleep(2000);
            WebElement loginHeader = driver.findElement(By.xpath("//*[@class='login-header']"));
            String text = loginHeader.getText();
            Assert.assertEquals(text, "Log-in to your account");
            // провальный тест:
//        Assert.assertEquals(text, expected:"111Log-in to your account");
        }

        // //*[@class='login-img-content']
        // //*[text()='Plan your next trip with us!']
        //  поиск через частичный текст //*[contains(text(),'next trip')]

//    failing tests:
        @Test
        public void openUrl_TryToOpenDeens_GoogleOpened () {
            driver.get("https://www.google.com");
            var title = driver.getTitle();
            Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");
        }

        @Test
        public void openUrl_TryToOpenDeens_BingOpened () {
            driver.get("https://Bing.com/");
            var title = driver.getTitle();
            Assert.assertEquals(title, "Deens, plan my trip!", "XXXXXXXXX or Expected title is wrong");
            // добавляем message чтобы тест выделялся в куче множества тестов, если падает и нужно легко найти
        }

        @Test
        public void openUrl_TryToOpenDeens_DeensOpened () {
            driver.get("https://deens-master.now.sh/");
            var title = driver.getTitle();
            Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");
        }
        @Test
        public void openUrl_TryToOpenDeensCheckUrl_DeensOpened () {
            driver.get("https://deens-master.now.sh/");
            var url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://deens-master.now.sh/", "Expected URL is xxxxxx");

        }
    }


