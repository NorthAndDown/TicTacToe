package com.northanddown.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {


	// Test for constructor
	@Test
	public void testPlayerConstructor() {
		Player player = new Player('X');
        	assertEquals(player.getSign(), 'X');
	}

}

