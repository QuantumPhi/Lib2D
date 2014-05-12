package game.util.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheet {
    
    private BufferedImage sprites;
    private int width, height;
    
    public SpriteSheet(String pathToSheet, int pwidth, int pheight) throws IOException {
        sprites = ImageIO.read(new File(pathToSheet));
        width = pwidth;
        height = pheight;
    }
    
    public Sprite[] getAnimation(float scale) {
        Sprite[] anim = new Sprite[(sprites.getWidth() / width) * (sprites.getHeight() / height)];
        for(int i = 0; i < sprites.getWidth() / width; i++)
            for(int j = 0; j < sprites.getHeight() / height; j++)
                anim[i * sprites.getHeight() / height + j] = new Sprite(sprites.getSubimage(i, j, width, height), scale, 0, 0);
        return anim;
    }
}
