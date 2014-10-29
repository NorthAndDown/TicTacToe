package com.northanddown.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTable{
	@Test
	public void testPrint(){
	Table table = new Table();
	table.print();
	//assertNotEquals("", "");
	}

        @Test
        public void testInputOutOfBounds(){
        Table table = new Table();
        assertEquals(false, table.inputChecker(4, 0));
        }

	@Test
        public void testValidInput(){
        Table table = new Table();
        assertEquals(true, table.inputChecker(1, 0));
        }


}
