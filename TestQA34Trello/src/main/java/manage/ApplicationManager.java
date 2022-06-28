package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

    WebDriver wd;

    UserHelper user;


    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/ru");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(wd);
    }

    public void stop() {
        wd.close();
        wd.quit();
    }

    public UserHelper getUser() {
        return user;
    }
}
