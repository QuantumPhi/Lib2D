package game.util.image;

import game.util.ImageMask;

public class Animation {
    
    protected Sprite[] frames;
    protected ImageMask[] masks;
    
    public Animation(Sprite[] pframes) {
        frames = pframes;
    }
    
    public Animation(SpriteSheet sprites) {
        this(sprites.getAnimation(1.0f));
    }
    
    private void init() {
        masks = new ImageMask[frames.length];
        for(int i = 0; i < frames.length; i++)
            masks[i] = frames[i].getMask();
    }
    
    public int getLength() { return frames.length; }
    public Sprite getFrame(int index) { return frames[index]; }
}
