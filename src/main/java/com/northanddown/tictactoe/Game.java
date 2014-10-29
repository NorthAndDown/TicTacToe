package com.northanddown.tictactoe;

public class Game {
	private Table table;
	private Player playerX;
	private Player playerO;
	private Player currentPlayer;
	
	//kallar i initialize og luppar(while table.notFull||!win)
	public void run() {
		welcomeMsg();
		initTable();
		initPlayers();
		gameOverMsg();
	}
	private void welcomeMsg() {
		System.out.println("======= Tic Tac Toe =======");
	}
	private void initTable() {
		table = new Table();
		table.print();
	}
	private void initPlayers() {
		playerX = new Player('X');
		playerO = new Player('O');
		currentPlayer = playerX;
	}
	private void gameOverMsg() {
		System.out.println("=======  Game over  =======");
	}
}
