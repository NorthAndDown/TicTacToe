package com.northanddown.tictactoe;

// Player class. Player contains a constructor for player and a method for getting players sign. 
public class Player {

	public char sign;

	public Player(char theSign){
		sign = theSign;
	}

	public char getSign(){
		return sign;
	}
}
