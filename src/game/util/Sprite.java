package game.util;

import game.GameContainer;
import java.awt.Graphics2D;
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
    
    private void init(){
	BufferedImage resizedImage = new BufferedImage((int)(image.getWidth()*scale), (int)(image.getHeight()*scale), BufferedImage.TYPE_INT_ARGB);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(image, 0, 0, resizedImage.getWidth(), resizedImage.getHeight(), null);
	g.dispose();
        image = resizedImage;
    }
    
    public void render(GameContainer container, int x, int y) {
        image.getGraphics().drawImage((Image)image, x, y, null);
    }
}
