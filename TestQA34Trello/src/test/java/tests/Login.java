package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

    WebDriver wd;

    @Test
    public void login1(){

        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/ru");
        



    }
}
