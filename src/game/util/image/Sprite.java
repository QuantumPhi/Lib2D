package game.util.image;

import game.util.ImageMask;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {
    
    private int x, y;
    
    private BufferedImage image;
    private ImageMask mask = null;
    private float scale;
    
    public Sprite(Image pimage, float pscale, int px, int py) {
        image = (BufferedImage) pimage;
        scale = pscale;
        x = px;
        y = py;
    }
    
    public Sprite(String pathToImage, float scale, int x, int y) throws IOException {
        this(ImageIO.read(new File(pathToImage)), scale, x, y);
    }
    
    private void init(){
	BufferedImage resizedImage = new BufferedImage((int)(image.getWidth()*scale), (int)(image.getHeight()*scale), BufferedImage.TYPE_INT_ARGB);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(image, 0, 0, resizedImage.getWidth(), resizedImage.getHeight(), null);
	g.dispose();
        image = resizedImage;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return image.getWidth(); }
    public int getHeight() { return image.getHeight(); }
    public float getScale() { return scale; }
    public Image getImage() { return image; }
    public ImageMask getMask() { return mask; }
    
    public void setX(int px) { x = px; }
    public void setY(int py) { y = py; }
    public void setScale(float pscale) { scale = pscale; init(); }
    public void setMask(ImageMask pmask) { mask = pmask; }
}
