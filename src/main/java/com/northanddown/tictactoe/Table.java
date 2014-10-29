package com.northanddown.tictactoe;

public class Table {

	private char[3][3]board;
	/*
	TODO: núllstilla board array
	*/   
	public void initialize() {
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				board[i][j] = '';
			}
		}
	}

	public void print(){
	
	}

<<<<<<< HEAD
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
=======
	public void inputChecker(){}
	public void isFull(){}
	public void checkForWin(){}
	private void checkHorWin(){}
        private void checkVerWin(){}
        private void checkDiaWin(){}
        private void  insert(){}
>>>>>>> 882210dbc2dd072727a9f7c8d2aaf080db57436c
}
