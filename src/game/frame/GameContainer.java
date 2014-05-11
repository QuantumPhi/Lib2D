package game.frame;

import game.Game;
import javax.swing.JFrame;

public class GameContainer extends JFrame {
    
    protected Game game;
    protected Object[] objects;
    
    public GameContainer(String title, Game game) {
        super(title);
        init(game);
    }
    
    private void init(Game pgame) {
        game = pgame;
    }
}
