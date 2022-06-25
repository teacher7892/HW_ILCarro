package tests;
//import org.openqa.selenium.WebDriver;
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
    @Test
    public void successLogin (){
        openLoginForm ();//2,3
        fillLoginForm ("felicita92@mail.com","Felicita92$");//4 + valid data
        submitLogin ();//5
    }
   @Test
    public void unsuccessLoginWrongEmail (){
        openLoginForm ();//2,3
        fillLoginForm ("felicita92mail.com","Felicita92$");//4 + invalid data
        submitLogin ();//5
    }



}
