package projects.tictactoe.strategies.botPlayingStrategy;

import projects.tictactoe.models.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Player player, Board board) {
        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
              if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                  board.getBoard().get(i).get(j).setPlayer(player);
                  board.getBoard().get(i).get(j).setCellState(CellState.FILLED);
                  return new Move(new Cell(i,j), player );
              }
            }
        }
        return null;
    }
}
