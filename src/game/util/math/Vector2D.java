package game.util.math;

public class Vector2D {
    
    private double x, y;
    
    public Vector2D(double _x, double _y) { x=_x;y=_y; }
    
    public double getX() { return x; }
    public double getY() { return y; }
    
    public void setX(double _x) { x=_x; }
    public void setY(double _y) { y=_y; }
}
