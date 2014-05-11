package game;

import javax.swing.JFrame;

public class GameContainer extends JFrame {
    
    protected Game game;
    
    public GameContainer(String title, Game game) {
        super(title);
        init(game);
    }
    
    private void init(Game pgame) {
        game = pgame;
    }
}
