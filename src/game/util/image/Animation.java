package game.util.image;

import game.util.ImageMask;

public class Animation {
    
    protected Sprite[] frames;
    protected ImageMask[] masks;
    
    public Animation(SpriteSheet sprites) {
        frames = sprites.getAnimation();
    }
    
    private void init() {
        masks = new ImageMask[frames.length];
        for(int i = 0; i < frames.length; i++)
            masks[i] = frames[i].getMask();
    }
    
    public int getLength() { return frames.length; }
    public Sprite getFrame(int index) { return frames[index]; }
}
