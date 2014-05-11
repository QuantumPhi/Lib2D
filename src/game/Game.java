package game;

import game.frame.GameContainer;
import game.util.exception.Lib2DException;

public abstract class Game {
    
    protected GameContainer container;
    
    public Game(GameContainer pcontainer) throws Lib2DException {
        if(pcontainer != null)
            container = pcontainer;
        else
            throw new Lib2DException("Container not properly initialized.");
    }
    
    abstract void init();
    abstract void update();
    abstract void render();
}
