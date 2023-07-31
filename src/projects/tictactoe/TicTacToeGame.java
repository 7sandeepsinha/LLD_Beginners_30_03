package projects.tictactoe;

import projects.tictactoe.controller.GameController;
import projects.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("Please enter the dimension of the game");
        int dimension = sc.nextInt();

        System.out.println("Will there be any bot in the game ? Y/N");
        String isBotPresent = sc.next();

        List<Player> players = new ArrayList<>();
        int iteratorNumber = dimension-1;

        if(isBotPresent.equals("Y")){
            iteratorNumber = dimension-2;
        }

        for(int i=0;i<iteratorNumber;i++){
            //TODO : validate if no one passes a duplicate symbol
            System.out.println("What is the name of the player number : " + (i+1));
            String playerName = sc.next();

            System.out.println("What is the character symbol of the player number : " + (i+1));
            String characterSymbol = sc.next();

            players.add(new Player(new Symbol(characterSymbol.charAt(0)), playerName, PlayerType.HUMAN ));
        }

        if(isBotPresent.equals("Y")){
            System.out.println("What is the name of the BOT");
            String playerName = sc.next();

            System.out.println("What is the character symbol of the BOT");
            String characterSymbol = sc.next();

            players.add(new Player(new Symbol(characterSymbol.charAt(0)), playerName, PlayerType.BOT ));
        }

        Game game = gameController.createGame(dimension, players);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            System.out.println("Current board status");
            gameController.displayBoard(game);
            // TODO : undo
            gameController.executeMove(game);
            // TODO : write logic for giving each player option to play

        }

        System.out.println("Game has ended, result was : ");
        if(gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("GAME WAS A DRAW");
        } else {
            System.out.println("Game is won by : " + gameController.getWinner(game));
        }


    }
}
