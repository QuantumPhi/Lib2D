package game.entity;

import game.entity.properties.Gravity;
import game.util.Vector2D;

public abstract class Entity implements Gravity {
    
    protected int x, y;
    protected Vector2D velocity;
    protected boolean grav;
    
    public Entity() { 
        this(0, 0); 
    }
    public Entity(boolean _grav) { 
        this();
        grav = _grav; 
    }
    public Entity(int _x, int _y) { 
        x = _x;
        y = _y;
        init();
        velocity = new Vector2D(0, 0);
    }
    public Entity(int _x, int _y, boolean _grav) { 
        this(_x,_y);
        init();
        grav = _grav; 
    }
    
    public abstract void init(); 
    public abstract void render();
    
    protected void updateValues(int delta) {
        y = grav ? y-(int)Math.round(((double)delta / 100) * G * multiplier) : y;
    }
}
