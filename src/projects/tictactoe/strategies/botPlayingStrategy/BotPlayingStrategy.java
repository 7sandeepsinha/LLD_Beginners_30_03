package projects.tictactoe.strategies.botPlayingStrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
