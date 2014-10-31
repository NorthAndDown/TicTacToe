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
        public void FullTableCheck() {
		Table board = new Table();
		for(int x = 0 ; x < 3 ; x++){
			for(int y = 0 ; y < 3 ; y++){
				board.insert(x,y,'F');
			}
		}
		assertEquals(true, board.isFull());
         }

	@Test
        public void NotFullCheck() {
                Table board = new Table();
                for(int x = 0 ; x < 3 ; x++){
                        for(int y = 0 ; y < 2 ; y++){
                                board.insert(x,y,'F');
                        }
                }
                assertEquals(false, board.isFull());
         }

	@Test
        public void WinHorChecker() {
                Table board = new Table();
                for(int y = 0 ; y < 3 ; y++){
                       	board.insert(1,y,'X');
 		}
                assertEquals(true, board.checkForWin());
         }

	@Test
        public void WinVerChecker() {
                Table board = new Table();
                for(int x = 0 ; x < 3 ; x++){
                        board.insert(x,2,'O');
                }
                assertEquals(true, board.checkForWin());
         }

	@Test
        public void WinDiaChecker() {
                Table board = new Table();
                board.insert(0,0,'X');
		board.insert(1,1,'X');
		board.insert(2,2,'X');
                assertEquals(true, board.checkForWin());
         }

	public void NOTWinHorChecker() {
                Table board = new Table();
                board.insert(0,0,'X');
                board.insert(0,1,'O');
                board.insert(0,2,'X');
                assertEquals(false, board.checkForWin());
         }

        @Test
        public void NOTWinVerChecker() {
                Table board = new Table();
		board.insert(0,0,'O');
                board.insert(1,0,'X');
                board.insert(2,0,'X');
                assertEquals(false, board.checkForWin());
         }

        @Test
        public void NOTWinDiaChecker() {
                Table board = new Table();
                board.insert(0,0,'X');
                board.insert(1,1,'O');
                board.insert(2,2,'X');
                assertEquals(false, board.checkForWin());
         }

}

