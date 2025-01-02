package chess;

<<<<<<< HEAD
import boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String msg) {
=======
public class ChessException extends RuntimeException{
    public ChessException(String msg){
>>>>>>> origin/main
        super(msg);
    }
}
