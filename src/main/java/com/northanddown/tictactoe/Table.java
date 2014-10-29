package com.northanddown.tictactoe;

public class Table {

	private char[][] board = new char[3][3];
	/*
	TODO: nullstilla board array
	*/   
	public void initialize() {
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				 board[i][j] = '.';
			}
		}
	}

	public void print(){
		System.out.println("  0 1 2");
		System.out.print("-------");
                for(int i = 0 ; i < 3 ; i++){
                        for(int j = 0 ; j < 3 ; j++){
                                 System.out.print(" " + board[i][j] + " ");
                        }
			System.out.println();
                }
	}

	public void inputChecker(){

	}

	public void isFull(){

	}

	public void checkForWin(){

	}

	private void checkHorWin(){

	}

        private void checkVerWin(){

	}

        private void checkDiaWin(){

	}

        private void insert(){

	}

}
