package game.entity.properties;

import game.util.Vector2D;

public class Gravity {
    
    private final double G = 9.80665;
    
    private Vector2D vector;
    private double multiplier;
    
    public Gravity(double multiplier) {
        vector = new Vector2D(0, 0);
    }
    
    public void update(int delta) { 
        vector.setY(-((double)delta / 100 * G * multiplier));
    }
    
    public double getMultiplier() { return multiplier; }
}
