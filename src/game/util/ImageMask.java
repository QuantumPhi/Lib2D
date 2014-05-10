package game.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageMask {
    
    protected int x, y;
    protected int width, height;
    protected float scale;
    
    protected boolean[][] mask;
    protected BufferedImage image;
    
    public ImageMask(Image _image, float _scale) {
        image = (BufferedImage) image;
        scale = _scale;
        init();
    }
    
    public ImageMask(String pathToImage, float scale) throws IOException {
        this(ImageIO.read(new File(pathToImage)), scale);
    }
    
    protected void init() {
        mask = new boolean[image.getWidth()][image.getHeight()];
        for(int i = 0; i < image.getWidth(); i++)
            for(int j = 0; j < image.getHeight(); j++)
                if(((image.getRGB(i, j) & 0xFF000000) >>> 24) != 0)
                    mask[i][j] = true;
        width = image.getWidth();
        height = image.getHeight();
    }
    
    public boolean intersects(ImageMask other) {
        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++)
                for(int k = 0; k < other.getWidth(); k++)
                    for(int l = 0; l < other.getHeight(); l++)
                        if(x+i*scale==(int)Math.round(other.getX()+k*other.getScale()) &&
                                y+j*scale==(int)Math.round(other.getY()+l*other.getScale()))
                            return true;
        return false;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public float getScale() { return scale; }
}