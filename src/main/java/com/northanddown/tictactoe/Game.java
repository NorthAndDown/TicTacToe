package com.northanddown.tictactoe;

public class Game {
	private Table table;
	private Player playerX;
	private Player playerO;
	private Player currentPlayer;
	
	//kallar i initialize og luppar(while table.notFull||!win)
	public void start() {
		welcomeMsg();
		table = new Table();
		table.print();
		gameOverMsg();
	}
	private void welcomeMsg() {
		System.out.println("======= Tic Tac Toe =======");
	}
	private void gameOverMsg() {
		System.out.println("=======  Game over  =======");
	}
}
