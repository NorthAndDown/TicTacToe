package com.northanddown.tictactoe;

import java.util.Scanner;

public class Game {
	private Table table;
	private Player playerX;
	private Player playerO;
	private Player currentPlayer;

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
			getInput();
			playing = false;
		}
	}
	private void printWhosTurn() {
		System.out.println("It is " + currentPlayer.getSign() + " turn to play");
	}

	private void getInput() {
		int x,y;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the x/y values");
		System.out.print("X: ");
 		x=in.nextInt();
		System.out.print("Y: ");
 		y=in.nextInt();
		if(!table.inputChecker(x,y))
		{
			do{
			System.out.println("Input was wrong. Please try again");
			System.out.println("X and Y must be between 0 and 2");
			System.out.print("X: ");
 			x=in.nextInt();
			System.out.print("Y: ");
 			y=in.nextInt();
			}while(!table.inputChecker(x,y));
		}

		in.close();
		System.out.println("X: " + x + " Y: " + y);
		table.insert(x, y, currentPlayer.getSign());
	}

	private void swapPlayers() {
		if(currentPlayer == playerX)
		{
			currentPlayer = playerO;
		}
		else
		{
			currentPlayer = playerX;
		}
	}
}
