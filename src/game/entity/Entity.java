package game.entity;

import game.entity.properties.Gravity;

public class Entity implements Gravity {
    
    protected int x, y;
    
    public Entity() { this(0, 0); }
    
    public Entity(int _x, int _y) { x=_x;y=_y; }
    
    @Override
    public void update(int delta) {
        y -= Math.round(((double)delta / 100) * G * multiplier);
    }
}
