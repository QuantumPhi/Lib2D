package game.entity;

import game.entity.properties.Gravity;
import game.util.math.Vector2D;

public abstract class Entity implements Gravity {
    
    protected int x, y;
    protected Vector2D velocity;
    protected boolean grav;
    
    public Entity() { 
        this(0, 0); 
    }

    public Entity(int px, int py) { 
        x = px;
        y = py;
        init();
        velocity = new Vector2D(0, 0);
    }
    
    public Entity(int px, int py, boolean pgrav) { 
        this(px,py);
        init();
        grav = pgrav; 
    }
    
    public abstract void init(); 
    public abstract void render();
    
    protected void updateValues(int delta) {
        y = grav ? y-(int)Math.round(((double)delta / 100) * G * multiplier) : y;
    }
}
