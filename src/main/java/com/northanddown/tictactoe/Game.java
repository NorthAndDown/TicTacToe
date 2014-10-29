package com.northanddown.tictactoe;

public class Game {
	private Table table;
	private Player playerX;
	private Player playerO;
	private Player currentPlayer;
	
	//kallar i initialize og luppar(while table.notFull||!win)
	public void run() {
		initTable();
		initPlayers();
		welcomeMsg();
		play();
		gameOverMsg();
	}
	private void initTable() {
		table = new Table();
	}
	private void initPlayers() {
		playerX = new Player('X');
		playerO = new Player('O');
		currentPlayer = playerX;
	}
	private void welcomeMsg() {
		System.out.println("======= Tic Tac Toe =======");
	}
	private void gameOverMsg() {
		System.out.println("=======  Game over  =======");
	}
	private void play() {
		boolean playing = true;
		while (playing) {
			table.print();
			printWhosTurn();
			playing = false;
		}
	}
	private void printWhosTurn() {
		System.out.println("It is " + currentPlayer.getSign() + " turn to play");
	}
}
