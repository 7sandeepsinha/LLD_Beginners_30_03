package projects.tictactoe.strategies.winningStrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
