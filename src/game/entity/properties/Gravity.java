package game.entity.properties;

public interface Gravity {
    
    final double G = 9.80665;
    
    double multiplier = 1.0;
    
    void update(int delta);
}
