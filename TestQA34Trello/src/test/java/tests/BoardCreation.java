package tests;

import models.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {


    @Test
    public void boardCreation1() {

        int boardCountBeforeCreation = app.getBoard().getBoardCount();
        Board board = new Board().setTitle("testQA");
        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillboardCreationForm(board);
        //app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();

        int boardCountAfterCreation = app.getBoard().getBoardCount();
        Assert.assertEquals(boardCountAfterCreation, boardCountBeforeCreation+1);
    }
}
