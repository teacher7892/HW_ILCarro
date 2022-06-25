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
