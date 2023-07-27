package projects.tictactoe.models;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

    public Cell(int row, int col, Player player) {
        this.row = row;
        this.col = col;
        this.player = player;
        this.cellState = CellState.FILLED;
    }

    public void display(){
        if(player == null){
            System.out.print("| |");
        } else if(cellState.equals(CellState.BLOCKED)){
            System.out.print("||||");
        } else {
            System.out.print("|" + player.getSymbol().getSymbolChar()+ "|");
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
