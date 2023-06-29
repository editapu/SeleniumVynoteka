import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class Template {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Ignore
    @Test
    public void getPage() {
        driver.get("https://www.vynoteka.lt");
        Thread.sleep(2000);   // uždeda fiksuotą palaukimą ten kur norim, bet nelabai naudojama 
        WebElement cookieButton = driver.findElement(By.id(""));
        cookieButton.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app__inner\"]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        driver.findElement(By.className("c-buttons")).click();
        driver.findElement(By.className("omnisend-form-63ff1f31b40d6530aba59a6d-image-container-63cfe6cf8ddbcad107509432")).click();
        driver.findElement(By.className("d-none.d-md-block")).click();
        driver.findElement(By.className("btn transparent modal_close-button")).click();
        driver.findElement(By.id("searchButton")).sendKeys("sūris");
        driver.findElement(By.className("omnisend-form-63ff1f31b40d6530aba59a6d-content-inner")).click();
        driver.findElement(By.className("text")).sendKeys("sūris");
        driver.findElement(By.id("searchButton")).click();

    }

    @Test
    public void vynoteka() {
        driver.get("https://www.vynoteka.lt");
        driver.findElement(By.xpath(""));
    }


    //driver.findElement(By.id("nukopijuojam iš interneto nuorodą")).sendKeys("parašome ko norime ieškoti paieškoje, pvz.: sūris");
    //driver.findElement(By.id("searchButton")).click();
    //driver.findElements(By.className("nukopijuojam iš interneto, pvz.:simpleAids"));

    //find.Element = grąžiną web elementą;
    //find.Elements = grąžiną web elementų masyvą;

    //driver.findElement(By.tagName("div"));
    //driver.findElement(By.id("itemList")).findElements(By.tagName("li"));
    wait.until(ExpectedCondition.elementToBeClickable(By.xpath("")));


    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        acceptCookiesAndStuff();


    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
        //driver.close();
    }

}



