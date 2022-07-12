package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @BeforeMethod
    public void preConditions(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }


    @Test
    public  void loginPositive() throws InterruptedException {
        User user =  User.builder().email("pankotanya30@gmail.com").password("07itanon").build();
        app.getUser().initLogin();
        app.getUser().fillInLoginForm(user);
        app.getUser().submitLogin();

        Assert.assertTrue(app.getUser().isLogged());
    }


}