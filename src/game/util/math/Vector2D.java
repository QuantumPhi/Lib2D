package game.util.math;

public class Vector2D {
    
    private double x, y;
    
    public Vector2D(double px, double py) { x=px;y=py; }
    
    public double getX() { return x; }
    public double getY() { return y; }
    
    public void setX(double px) { x=px; }
    public void setY(double py) { y=py; }
}
