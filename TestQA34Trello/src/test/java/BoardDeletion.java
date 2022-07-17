import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class BoardDeletion extends TestBase {
    @Test
    public void boardDeletion1() {
        int boardCountBeforeDeletion = app.getBoard().getBoardCount();

        app.getBoard().clickOnTheFirstBoard();
        app.getBoard().openSideBoardMenu();
        app.getBoard().openMore();
        app.getBoard().deleteBoard();

        int boardCountAfterDeletion = app.getBoard().getBoardCount();
        Assert.assertEquals(boardCountAfterDeletion, boardCountBeforeDeletion - 1);


    }
}
