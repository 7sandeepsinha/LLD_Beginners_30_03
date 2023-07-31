package projects.tictactoe.models;

import java.util.Scanner;

public class Player {
    private static int idCounter = 0;
    private int id;
    private Symbol symbol;
    private String name;
    private PlayerType playerType;
    private Scanner scanner;

    public Player(Symbol symbol, String name, PlayerType playerType) {
        this.id = idCounter++;
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
        this.scanner = new Scanner(System.in);
    }

    public Move makeMove(Board board){
        System.out.println("Please enter the row for the move");
        int row = scanner.nextInt();
        System.out.println("Please enter the column for the move");
        int col = scanner.nextInt();

        //TODO : validate the move and throw exception or msg

//        Cell cell = new Cell(row, col, this);
//        Move move = new Move(cell, this);
        board.getBoard().get(row).get(col).setPlayer(this);
        return new Move(new Cell(row,col,this), this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}