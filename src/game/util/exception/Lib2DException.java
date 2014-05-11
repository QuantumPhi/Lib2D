package game.util.exception;

public class Lib2DException extends Exception {
    
    public Lib2DException() {
        super();
    }
    
    public Lib2DException(String errorString) {
        super(errorString);
    }
    
    public Lib2DException(String errorString, Throwable cause) {
        super(errorString, cause);
    }
    
    public Lib2DException(Throwable cause) {
        super(cause);
    }
}
