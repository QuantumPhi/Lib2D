package game.util.image;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheet {
    
    public BufferedImage[] image;
    
    public SpriteSheet(String pathToSheet) throws IOException {
        init(ImageIO.read(new File(pathToSheet)));
    }
    
    private void init(Image image) {
        
    }
}
