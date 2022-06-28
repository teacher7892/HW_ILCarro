package tests;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    /////success:
    //1.open browser
    //2.open www form
    //3.click on header button 'Login'
    //4.fill form + valid data
    //5.submit by click on 'yalla'
    //6.assert -is login successful?
    //7.wd quit

    ////unsuccess:
    //1.open browser
    //2.open www form
    //3.click on header button 'Login'
    //4.fill form + valid data
    //5.submit by click on 'yalla'
    //6.assert -is login successful?
    //7.wd quit

    @BeforeMethod
    public void preCondition () {
        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logOut();
        }
    }
    @Test
    public void successLogin(){
        app.getHelperUser().openLoginForm ();//2,3
        app.getHelperUser().fillLoginForm ("felicita92@mail.com","Felicita92$");//4 + valid data
        app.getHelperUser().submitLogin ();//5
    }
   @Test
    public void unsuccessLoginWrongEmail(){
        app.getHelperUser().openLoginForm ();//2,3
        app.getHelperUser().fillLoginForm ("felicita92mail.com","Felicita92$");//4 + invalid data
        app.getHelperUser().submitLogin ();//5
    }



}
/*
package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends BaseTests{

    @Test
    public void successRegistration (){
        openRegistrationForm ();
        fillRegistrationForm ("Oksana", "Lure",
                "oksana92@mail.com",
                "Oksana92$");//valid data
        submitCheckBox();
        submitRegistration ();
    }

    public void unsuccessRegistrationWrongPassword (){
        openRegistrationForm ();
        fillRegistrationForm ("Oksana", "Lure",
                "oksana92@mail.com",
                "Ok");//invalid data
        submitCheckBox();
        submitRegistration ();
    }

}
 */
/*

 public void openRegistrationForm() {
        WebElement element2 = wd.findElement(By.cssSelector("a[href='/registration?url=%2Fsearch']"));
        element2.click();
    }

    public void fillRegistrationForm(String name, String lastName,
                                     String email, String password) {
        type(By.xpath("//input[@id='name'"), name);
        type(By.xpath("//input[@id='lastName']"), lastName);
        type(By.xpath("//input[@id='email']"), email);
        type(By.xpath("//input[@id='password']"), password);

    }

    public void type1(By locator, String text) {
        if (text != null) {
            WebElement element2 = wd.findElement(locator);
            element2.click();
            element2.clear();
            element2.sendKeys();
        }
    }

    public void submitCheckBox() {
        wd.findElement(By.cssSelector("[href='/terms-of-use']")).click();
        wd.findElement(By.cssSelector("[href='privacy-police']")).click();
        wd.findElement(By.cssSelector("div[class ='checkbox-container']")).click();
    }

    public void submitRegistration() {
        wd.findElement(By.xpath("//button[@type='submit']")).click();
    }
 */