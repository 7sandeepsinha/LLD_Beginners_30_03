package projects.tictactoe.exception;

public class InvalidNumberOfPlayersException extends RuntimeException{
    public InvalidNumberOfPlayersException(String message) {
        super(message);
    }
}
