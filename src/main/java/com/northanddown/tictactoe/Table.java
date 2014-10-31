package com.northanddown.tictactoe;

public class Table {
	private char[][] board;

	//Constructor
	public Table(){
		//Creates and fills the array with ' ' space characters
		board = new char[3][3];
		initialize();
	}

	//Sets all characters in the array to space
	public void initialize() {
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				 board[i][j] = ' ';
			}
		}
	}

	//Prints out status of the table
	public void print(){
		System.out.println("   0   1   2");
		System.out.println(" -------------");
                for(int x = 0 ; x < 3 ; x++){
			System.out.print(x + "|");
                        for(int y = 0 ; y < 3 ; y++){
                                 System.out.print(" " + board[y][x] + " |");
                        }
			System.out.println();
			System.out.println(" |---|---|---|");
                }
	}

	//Returns true if it's within the array and is empty (space)
	public boolean inputChecker(int x, int y){
		if(x < 0 || x > 2 || y < 0 || y > 2){
			return false;
		}
		if(board[y][x] == ' '){
			return true;
		}
		return false;
	}

	//returns true if the array has no empty spot
	public boolean isFull(){
		for(int i = 0 ; i < 3 ; i++){
                        for(int j = 0 ; j < 3 ; j++){
                                 if(board[i][j] == ' '){
					return false;
				}
                        }
                }
		return true;
	}

	//Returns true if X or Y has won the game
	public boolean checkForWin(){
		return (checkHorWin() || checkVerWin() || checkDiaWin());
	}

	//returns true if there is the same character in all character spaces in a - horizontal
	private boolean  checkHorWin(){
		for(int i = 0 ; i < 3 ; i++){
                	if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != ' '){
				return true;
			}
                }
		return false;
	}

	//returns true if there is the same character in all character spaces in a | vertical
        private boolean  checkVerWin(){
		for(int i = 0 ; i < 3 ; i++){
                        if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' '){
                                return true;
                        }
                }
                return false;
	}

        private boolean checkDiaWin(){
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' '){
			return true;
		}
		if(board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != ' '){
			return true;
		}
		return false;
	}

        private void insert(int x, int y, char c){
		board[x][y] = c;
	}

}
