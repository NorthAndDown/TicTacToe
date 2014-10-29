package com.northanddown.tictactoe;

public class Table {
	private char[][] board;

	public Table(){
		board = new char[3][3];
		initialize();
	}

	public void initialize() {
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				 board[i][j] = ' ';
			}
		}
	}

	public void print(){
		System.out.println("   0   1   2");
		System.out.println(" -------------");
                for(int i = 0 ; i < 3 ; i++){
			System.out.print(i + "|");
                        for(int j = 0 ; j < 3 ; j++){
                                 System.out.print(" " + board[i][j] + " |");
                        }
			System.out.println();
			System.out.println(" |---|---|---|");
                }
	}

	public boolean inputChecker(int x, int y){
		if(x < 0 || x > 2 || y < 0 || y > 2){
			//System.out.println("Fyrri if setningin");
			return false;
		}
		if(board[y][x] == ' '){
			//System.out.println("Seinni if setnign");
			return true;
		}
		//System.out.println("Seinasta skilyrdid");
		return false;
	}

	public void isFull(){
		for(int i = 0 ; i < 3 ; i++){
                        for(int j = 0 ; j < 3 ; j++){
                                 //if(board[i][j] = ' ');
                        }
                }

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
