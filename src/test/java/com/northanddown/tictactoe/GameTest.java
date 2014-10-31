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

}

