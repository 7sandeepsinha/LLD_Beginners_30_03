package projects.tictactoe.controller;

import projects.tictactoe.models.Game;
import projects.tictactoe.models.GameState;
import projects.tictactoe.models.Player;
import projects.tictactoe.strategies.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        try{
            return Game.builder()
                    .setDimension(dimension)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .build();
        }catch (Exception e){
            System.out.println("Could not start the game, something went wrong");
        }
        return null;
    }

    public void displayBoard(Game game){
        game.getBoard().printBoard();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void executeMove(Game game){
        int nextPlayerIndex = game.getNextPlayerIndex();
        Player nextPlayerToPlay = game.getPlayers().get(nextPlayerIndex);
        nextPlayerToPlay.makeMove(game.getBoard());
    }

    public String getWinner(Game game){
        return game.getWinner().getName();
    }
}
