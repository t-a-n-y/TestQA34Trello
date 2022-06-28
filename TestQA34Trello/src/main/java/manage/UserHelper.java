package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{


    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initLogin(){click(By.cssSelector("[href='/login']"));
    }

    public void fillInLoginForm() throws InterruptedException {
        type(By.cssSelector("#user"), "pankotanya30@gmail.com");
        click(By.cssSelector("#login"));
        Thread.sleep(2000);
        type(By.cssSelector("#password"),"07itanon");
    }

    public void submitLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public void logOut() {
        click(By.cssSelector("[data-test-id='header-member-menu-button]"));

        click(By.cssSelector("[data-test-id='header-member-menu-logout]"));

        click(By.cssSelector("[data-test-id='logout-button]"));
    }

    public boolean isLogger() {
        return wd.findElements(By.cssSelector("[data-test-id='header-member-menu-button']")).size()>0;
    }


}
