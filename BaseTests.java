package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;



public class BaseTests {

    WebDriver wd;

    @BeforeMethod
    public void preCondition (){
        wd = new ChromeDriver();
        //2. open form www.
        wd.navigate().to("https://ilcarro-1578153671498.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    public void tearDown (){
        ////7.wd quit
        wd.quit();
    }

    ////////////////////////
    public void openLoginForm (){
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        loginTab.click();

    }

    public void fillLoginForm (String email, String password)  {
        type (By.xpath("//input[@id='email']"), email);
        type (By.xpath("//input[@id='password']"), password);
    }

    public void submitLogin (){
       wd.findElement(By.xpath("//button[@type='submit']")).click();
    }

    ///////
    public void type (By locator, String text){
        if (text != null){
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }




}
