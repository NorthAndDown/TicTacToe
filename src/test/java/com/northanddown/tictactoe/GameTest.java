package com.northanddown.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

    @Test
    public void checkPlayers() {
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        Player currentPlayer = playerX;
        assertEquals(true, currentPlayer == playerX);
    }

    @Test
    public void fullTableCheck() {
        Table board = new Table();
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                board.insert(x , y , 'F');
            }
        }
        assertEquals(true, board.isFull());
    }

    @Test
    public void notFullCheck() {
        Table board = new Table();
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 2; y++){
                board.insert(x , y , 'F');
            }
        }
        assertEquals(false, board.isFull());
    }

    @Test
    public void winHorChecker() {
        Table board = new Table();
        for (int y = 0; y < 3; y++){
            board.insert(1 , y , 'X');
        }
        assertEquals(true, board.checkForWin());
    }

    @Test
    public void winVerChecker() {
        Table board = new Table();
        for (int x = 0; x < 3; x++){
            board.insert(x , 2 , 'O');
        }
        assertEquals(true, board.checkForWin());
    }

    @Test
    public void winDiaChecker() {
        Table board = new Table();
        board.insert(0 , 0 , 'X');
        board.insert(1 , 1 , 'X');
        board.insert(2 , 2 , 'X');
        assertEquals(true, board.checkForWin());
    }

    public void notWinHorChecker() {
        Table board = new Table();
        board.insert(0 , 0 , 'X');
        board.insert(0 , 1 , 'O');
        board.insert(0 , 2 , 'X');
        assertEquals(false, board.checkForWin());
    }

    @Test
    public void notWinVerChecker() {
        Table board = new Table();
        board.insert(0 , 0 , 'O');
        board.insert(1 , 0 , 'X');
        board.insert(2 , 0 , 'X');
        assertEquals(false, board.checkForWin());
    }

    @Test
    public void notWinDiaChecker() {
        Table board = new Table();
        board.insert(0 , 0 , 'X');
        board.insert(1 , 1 , 'O');
        board.insert(2 , 2 , 'X');
        assertEquals(false, board.checkForWin());
    }

    @Test
    public void outOfBounds() {
        Table board = new Table();
        assertEquals(false, board.inputChecker(0, 3));
        assertEquals(false, board.inputChecker(3, 0));
        assertEquals(false, board.inputChecker(-1, 2));
        assertEquals(false, board.inputChecker(0, -1));
        assertEquals(false, board.inputChecker(-2, -2));
        assertEquals(false, board.inputChecker(4, 4));
        assertEquals(true, board.inputChecker(0, 0));
        assertEquals(true, board.inputChecker(2, 2));
        assertEquals(true, board.inputChecker(2, 0));
        assertEquals(true, board.inputChecker(0, 2));
    }
}

