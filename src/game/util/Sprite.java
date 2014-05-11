package game.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {
    
    private BufferedImage image;
    private float scale;
    
    public Sprite(Image pimage, float pscale) {
        image = (BufferedImage) pimage;
        scale = pscale;
    }
    
    public Sprite(String pathToImage, float scale) throws IOException {
        this(ImageIO.read(new File(pathToImage)), scale);
    }
    
    public void render(int x, int y) {
        image.getGraphics().drawImage((Image)image, x, y, null);
    }
}
