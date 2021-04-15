import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import  org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Haykuhi Safaryan\\Desktop\\cs\\Homework4_1\\chromedriver_win32\\chromedriver.exe");
        WebDriverFindElementSearch();
        WebDriverFindSignIn();

    }

    public static void WebDriverFindElementSearch(){
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.kaggle.com/");
        WebElement search = driver.findElement(By.cssSelector("#site-container > div > div.sc-qPzgd.sc-pYbQl.bPpTsi > div.sc-psrQp.kkPGoW > div.sc-ptBBy.fcuNmW.sc-qXFrf.bIgiDi > div > input"));
        search.click();
        WebElement searchValue = driver.findElement(By.xpath("//*[@id=\"site-container\"]/div/div[3]/div[1]/div/div[1]/form/input"));
        searchValue.click();
        searchValue.sendKeys("murder");
        searchValue.sendKeys(Keys.ENTER);
        searchValue.click();

    }

    public static void WebDriverFindSignIn(){
        WebDriver  driver = new ChromeDriver();
        driver.navigate().to( "https://www.kaggle.com/account/login?phase=emailSignIn&returnUrl=%2F" );
        WebElement username = driver.findElement(By.className("mdc-text-field__input"));
        username.click();
        username.sendKeys("user1");
        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("aaaa");
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"site-container\"]/div[1]/div/form/div[2]/div[3]/button"));
        signInButton.click();
        driver.quit();

    }
}