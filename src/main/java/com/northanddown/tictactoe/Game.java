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
		// boolean playing = true;
		while (!table.isFull() || table.checkForWin()) {
			table.print();
			printWhosTurn();
			getInput();
			swapPlayers();
			// playing = false;
		}
	}
	private void printWhosTurn() {
		System.out.println("It is " + currentPlayer.getSign() + " turn to play");
	}

	private void getInput() {
		int x,y;
	//	System.out.println("aetla ad opna scanner");
		//Scanner in = new Scanner(System.in);
	//	System.out.println("Opna input stream");
		System.out.println("Please enter the x/y values");
		System.out.print("X: ");
		Scanner xIN = new Scanner(System.in);
	 	x = xIN.nextInt();
		System.out.print("Y: ");
		Scanner yIN = new Scanner(System.in);
 		y = yIN.nextInt();

		if(!table.inputChecker(x,y))
		{
			do{
			System.out.println("Input was wrong. Please try again");
			System.out.println("X and Y must be between 0 and 2");
			System.out.print("X: ");
			Scanner tempX = new Scanner(System.in);
 			x = tempX.nextInt();
			System.out.print("Y: ");
			Scanner tempY = new Scanner(System.in);
 			y = tempY.nextInt();
			}while(!table.inputChecker(x,y));
		}

		System.out.println("Input straum lokad");
		System.out.println("X: " + x + " Y: " + y);
		table.insert(x, y, currentPlayer.getSign());
		System.out.println("Buinn ad inserta");
		System.out.println("Currplayer char = " + currentPlayer.getSign()); 
		//in.close();
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
