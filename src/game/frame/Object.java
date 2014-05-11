package game.frame;

import game.entity.Entity;
import game.util.image.Sprite;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Object extends JPanel {
    
    protected Sprite sprite;
    
    public Object(Sprite psprite) {
        Dimension dimension = new Dimension(sprite.getWidth(), sprite.getHeight());
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setSize(dimension);
        setLayout(null);
    }
    
    public Object(Entity entity) {
        this(entity.getSprite());
    }
    
    public void update(Sprite psprite) {
        sprite = psprite;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(sprite.getImage(), sprite.getX(), sprite.getY(), null);
    }
}
