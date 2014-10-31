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
            if (table.isFull()){
                playing = false;
                System.out.println("Table is full: Draw");
                table.print();
            }
            if (table.checkForWin())
            {
                System.out.println("Player " + currentPlayer.getSign() + " has won the game");
                table.print();
                playing = false;
            }
            swapPlayers();
        }
    }
    private void printWhosTurn() {
        System.out.println("It is " + currentPlayer.getSign() + " turn to play");
    }

    private void getInput() {
        int x,y;
        System.out.println("Please enter the x/y values");
        System.out.print("X: ");
        Scanner xIN = new Scanner(System.in);
        x = xIN.nextInt();
        System.out.print("Y: ");
        Scanner yIN = new Scanner(System.in);
        y = yIN.nextInt();

        if (!table.inputChecker(x,y))
        {
            do {
            System.out.println("Input was wrong. Please try again");
            System.out.println("X and Y must be between 0 and 2");
            System.out.print("X: ");
            Scanner tempX = new Scanner(System.in);
             x = tempX.nextInt();
            System.out.print("Y: ");
            Scanner tempY = new Scanner(System.in);
             y = tempY.nextInt();
            } while (!table.inputChecker(x,y));
        }

        System.out.println("X: " + x + " Y: " + y);
        table.insert(x, y, currentPlayer.getSign());
    }

    // function to swap players after round
    private void swapPlayers() {
        if (currentPlayer == playerX)
        {
            currentPlayer = playerO;
        }
        else
        {
            currentPlayer = playerX;
        }
    }
}
