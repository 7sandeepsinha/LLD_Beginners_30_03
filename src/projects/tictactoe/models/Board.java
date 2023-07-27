package projects.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size; // example -> 3
        this.board = new ArrayList<>();// []

        for(int i=0;i<size;i++){ // [[] [] []]
            this.getBoard().add(new ArrayList<>());
            for(int j=0;j<size;j++){ // [ [_,_,_],[_,_,_],[_,_,_] ]
                this.getBoard().get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            List<Cell> row = board.get(i);
            for(int j=0;j<size;j++){
                row.get(j).display();
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
