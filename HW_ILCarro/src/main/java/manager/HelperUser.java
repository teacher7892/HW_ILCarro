package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void openLoginForm (){
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        loginTab.click();

    }

    public void fillLoginForm (String email, String password)  {
        type (By.xpath("//input[@id='email']"), email);
        type (By.xpath("//input[@id='password']"), password);
    }

    public void submitLogin (){
        wd.findElement(By.cssSelector("[type='submit']"));
    }

    public boolean isLogged() {
        //sign out exists ---> logged
        List<WebElement> list = wd.findElements(By.cssSelector("[href='/logout?url=%2Fsearch']"));
        return list.size()>0;
    }

    public void logOut() {
        click(By.cssSelector("[href='/logout?url=%2Fsearch']"));
    }


}




